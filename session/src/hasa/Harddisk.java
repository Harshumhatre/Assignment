package hasa;

public class Harddisk {
	String  brand;
	int size;
	String type;
	public Harddisk(String brand, int size, String type) {
		super();
		this.brand = brand;
		this.size = size;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Harddisk [brand=" + brand + ", size=" + size + ", type=" + type + "]";
	}

}
