package configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import modelo.entidades.Director;
import modelo.entidades.Pelicula;

@Configuration
public class ConfiguracionSpring {

	@Bean
	@Scope(value = "prototype")
	public Director director() {
		return new Director();
	}

	@Bean
	@Scope(value = "prototype")
	public Pelicula pelicula(Director director) { // El autowire se hace poniéndole por parámetro las dependencias
		Pelicula p = new Pelicula();
		p.setTitulo("Mulholland Drive");
		p.setDirector(director);
		return p;
	}
}
