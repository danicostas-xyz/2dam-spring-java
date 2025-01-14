package es.upgrade.modelo.entidad;


public class Peripheral {
	private String type;
	private String manufacturer;
	private double price;

	public Peripheral() {
		super();
	}

	public Peripheral(String type, String manufacturer, double price) {
		super();
		this.type = type;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Peripheral [type=" + type + ", manufacturer=" + manufacturer + ", price=" + price + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
