package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import modelo.entidad.Persona;

public class Main01 {

	public static ApplicationContext context;

	public static void main(String[] args) {
		// Vamos a dar de alta los objetos (BEANS) dentro de SPRING CONTEXT
		// En este caso, mediante XML

		context = new ClassPathXmlApplicationContext("context01.xml");

		Persona p = (Persona) context.getBean("juan");
		p.setNombre("Juanito");
		p.setEdad(28);
		p.setPeso(75);

		p = null;

//		p = context.getBean("pepe", Persona.class); No hace falta ponerlo aquí porque le pasamos el string del nombre más abajo

		imprimir("juan");
		imprimir("pepe");

	}

	private static void imprimir(String s) {
		Persona p = (Persona) context.getBean(s);
		System.out.println(p);
	}

}
