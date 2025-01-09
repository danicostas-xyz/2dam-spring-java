package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Pelicula;

public class MainAnotaciones01 {

	/*
	 * En este ejemplo vamos a dar de alta el contexto de Spring con XML pero vamos
	 * a dar de alta los beans mediante anotaciones
	 * 
	 */

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context01.xml");

		Pelicula p = context.getBean("pelicula", Pelicula.class);
		System.out.println(p);
	}

}
