package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Director;
import modelo.entidad.Pelicula;
import modelo.entidad.Persona;

public class Main03 {

	public static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("context03.xml");

		Pelicula p = context.getBean("pelicula", Pelicula.class);

		System.out.println(p.getDirector()); // No hemos creado ningún director, pero como se inyecta a Pelicula, sí que
												// lo tenemos
		
		Pelicula titanic = context.getBean("titanic", Pelicula.class);
		
		System.out.println(titanic);
		
		Director d = context.getBean("jamesCameron", Director.class);

	}

}
