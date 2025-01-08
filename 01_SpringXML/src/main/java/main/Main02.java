package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class Main02 {

	public static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("context02.xml");

		Persona p = context.getBean("personaPrototipada", Persona.class);
		p.setNombre("Félix");
		System.out.println(p);

		p = context.getBean("personaPrototipada", Persona.class);

		System.out.println(p); // Aquí hemos perdido a la primera persona, porque hemos perdido la referencia,
								// ya que el objeto no está gestionado por el SPRING CONTEXT

		// Esto tiene la ventaja, a diferencia de hacer un constructor con propiedades
		// por defecto, de que puedes hacer una modificación a nivel de XML sin tocar el
		// código principal, lo que permite hacer cambios sin tener que recompilar el
		// código.

	}

}
