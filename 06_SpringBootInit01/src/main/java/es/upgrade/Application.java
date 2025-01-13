package es.upgrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import es.upgrade.modelo.entidades.Director;
import es.upgrade.modelo.entidades.Pelicula;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// Esta sentencia arranca el contexto de Spring
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Pelicula p = context.getBean("pelicula", Pelicula.class);
		System.out.println(p);
		Director d = context.getBean("directorJavaConfig", Director.class);
	}

    @Bean
    Director directorJavaConfig() {
		return new Director();
	}
	

}
