package modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Pelicula {
	@Value(value = "Titanic")
	private String titulo;
	@Autowired // El autowired se pone encima de cada atributo que se quiera inyectar.
	private Director director;
	@Autowired
	@Qualifier("personaBean")
	private Persona productor;

	public Persona getProductor() {
		return productor;
	}

	public void setProductor(Persona productor) {
		this.productor = productor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", productor=" + productor + "]";
	}

}
