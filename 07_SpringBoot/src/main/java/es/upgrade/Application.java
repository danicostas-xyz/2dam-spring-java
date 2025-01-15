package es.upgrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.upgrade.modelo.entidad.Direccion;
import es.upgrade.modelo.entidad.Empleo;
import es.upgrade.modelo.entidad.Persona;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private ApplicationContext context;
	@Autowired
	private Persona p2;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Direccion d = new Direccion();
		d.setNombreVia("hola");
		
		System.out.println(d.getNombreVia());
		System.out.println(d);
		
		Empleo e = new Empleo("UpgradeHub", 40000, false);
		System.out.println(e.isEstaDeBaja());
	}

	@Override
	public void run(String... args) throws Exception {
		Persona p = context.getBean("persona", Persona.class);
		System.out.println(p2);
		
	}

}
