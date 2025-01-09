package modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * La anotación @Component da de alta un objeto en el contexto de Spring de la clase 
 * donde esté y el id se tomará del nombre del tipo, en lowerCamelCase
 * 
 * <bean id="persona" class="modelo.entidad.Persona" scope="singleton"></bean>
 * 
 * Por defecto es SINGLETON, para cambiar -> @Scope("prototype")
 * 
 * <bean id="persona" class="modelo.entidad.Persona" scope="prototype"></bean>
 * 
 * Las anotaciones en Java suelen servir para añadir funcionalidades a las clases de manera automática
 * Lo malo de las anotaciones para dar de alta beans en el contexto de Spring, es que por cada clase 
 * solo puedes dar de alta un bean (ya sea singleton o prototype) mientras que en el XML puedes dar los que quieras
 * Además, no puedes dar de alta un bean de clases nativas de Java (ArrayList, etc.).
 * 
 * @Value(value = "18") -> Para dar valores por defecto
 * Se podría hacer también con el constructor por defecto
 * 
 * */

@Component("personaBean")
@Scope("prototype")
public class Persona {

	@Value(value = "Michael Scott")
	private String nombre;
	@Value(value = "45") // Para dar valores default sin constructor
	// <property name="edad" value="18"></property>
	private int edad;
	@Value(value = "65.5")
	private double peso;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}

}
