package hasa;

public class Functions {
	public static void main(String[] args) {
		Processor obj = new Processor("Linux",10, 3);
		Harddisk obj1 = new Harddisk("WD", 1, "ssd");
		OperatingSystem obj2 = new OperatingSystem("windows", 11, 64);
		Battery obj3 = new Battery(2000, 2, "Semens");
		Laptop laptop = new Laptop(100000, obj3, obj2, obj1, obj);
		System.out.println(laptop);	
	}

}
