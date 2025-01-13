package modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cpu {
	@Value("Intel")
	private String manufacturer;
	@Value("i7")
	private String model;
	@Value("16")
	private int numberOfCores;
	@Value("400")
	private double price;
	
	public Cpu(String manufacturer, String model, int numberOfCores, double price) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.numberOfCores = numberOfCores;
		this.price = price;
	}
	public Cpu() {
		super();
	}
	
	@Override
	public String toString() {
		return "Cpu [manufacturer=" + manufacturer + ", model=" + model + ", numberOfCores=" + numberOfCores
				+ ", price=" + price + "]";
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumberOfCores() {
		return numberOfCores;
	}
	public void setNumberOfCores(int numberOfCores) {
		this.numberOfCores = numberOfCores;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
