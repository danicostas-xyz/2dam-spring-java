package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import configuracion.ConfiguracionSpring;
import modelo.entidad.Pelicula;

public class MainAnotaciones02 {

	/*
	 * En este ejemplo vamos a dar de alta el contexto de Spring mediante una clase (ConfiguracionSpring)
	 * en lugar de mediante XML:
	 * 
	 * -> ApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class)
	 */

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);

		Pelicula p = context.getBean("pelicula", Pelicula.class);
		System.out.println(p);
		
		
	}

}
