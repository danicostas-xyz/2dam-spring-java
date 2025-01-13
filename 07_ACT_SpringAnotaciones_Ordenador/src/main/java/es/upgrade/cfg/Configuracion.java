package es.upgrade.cfg;

import java.awt.font.GraphicAttribute;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ch.qos.logback.core.Context;
import modelo.entidad.Computer;
import modelo.entidad.Cpu;
import modelo.entidad.GraphicCard;
import modelo.entidad.MotherBoard;
import modelo.entidad.Peripheral;
import modelo.entidad.Ram;

@Configuration
public class Configuracion {

	@Bean
	GraphicCard graphicCard(Ram ram) {
		
		GraphicCard graphicCard = new GraphicCard();
		
		ram.setManufacturer("Samsung");
		ram.setPrice(100);
		ram.setSize(12);
		
		graphicCard.setRam(ram);
		
		return graphicCard;
	}
	
	@Bean
	@Scope("prototype")
	Ram ram() {
		
		Ram ram = new Ram();
		ram.setManufacturer("Corsair");
		ram.setPrice(200);
		ram.setSize(16);
		
		return ram;
	}
	
	@Bean
	Peripheral teclado() {
		
		Peripheral teclado = new Peripheral();
		teclado.setManufacturer("Razer");
		teclado.setPrice(200);
		teclado.setType("Teclado");
		
		return teclado;
	}
	
	@Bean
	Peripheral raton() {
		
		Peripheral raton = new Peripheral();
		raton.setManufacturer("Logitech");
		raton.setPrice(150);
		raton.setType("Raton");
		
		return raton;
	}
	
	@Bean
	Computer computer(Cpu cpu, GraphicCard graphicCard, MotherBoard motherBoard, Ram ram) {
		
		Computer computer = new Computer();
		ArrayList<Ram> ramList = new ArrayList<Ram>();
		ArrayList<Peripheral> peripheralList = new ArrayList<Peripheral>();
		Ram ram1 = new Ram();
		ram1.setManufacturer("Samsung");
		ram1.setPrice(100);
		ram1.setSize(16);
		Ram ram2 = new Ram();
		ram2.setManufacturer("Samsung");
		ram2.setPrice(100);
		ram2.setSize(16);
		ramList.add(ram1);
		ramList.add(ram2);
		
		return computer;
	}
	
	
}
