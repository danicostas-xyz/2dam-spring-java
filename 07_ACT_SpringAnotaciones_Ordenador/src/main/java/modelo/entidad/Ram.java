package modelo.entidad;


public class Ram {
	private String manufacturer;
	private int size;
	private double price;

	public Ram() {
		super();
	}

	public Ram(String manufacturer, int size, double price) {
		super();
		this.manufacturer = manufacturer;
		this.size = size;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ram [manufacturer=" + manufacturer + ", size=" + size + ", price=" + price + "]";
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
