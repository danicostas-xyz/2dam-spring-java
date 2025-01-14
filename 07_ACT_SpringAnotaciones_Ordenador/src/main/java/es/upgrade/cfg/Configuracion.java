package es.upgrade.cfg;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import es.upgrade.modelo.entidad.Computer;
import es.upgrade.modelo.entidad.Cpu;
import es.upgrade.modelo.entidad.GraphicCard;
import es.upgrade.modelo.entidad.MotherBoard;
import es.upgrade.modelo.entidad.Peripheral;
import es.upgrade.modelo.entidad.Ram;

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
	Computer computer(Cpu cpu, GraphicCard graphicCard, MotherBoard motherBoard, Ram ram, Peripheral teclado, Peripheral raton) {
		
		Computer computer = new Computer();
		ArrayList<Ram> ramList = new ArrayList<Ram>();
		ArrayList<Peripheral> peripheralList = new ArrayList<Peripheral>();
		ramList.add(ram);
		ramList.add(ram);
		peripheralList.add(teclado);
		peripheralList.add(raton);
		computer.setCpu(cpu);
		computer.setGraphicCard(graphicCard);
		computer.setMotherBoard(motherBoard);
		computer.setPeripheralList(peripheralList);
		computer.setRamList(ramList);
		
		return computer;
	}
	
	
}
