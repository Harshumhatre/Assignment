
package hasa;

public class Laptop {
	double cost;
	private Battery battery;
	private OperatingSystem os;
	private Harddisk harddisk;
	private Processor processor;
	public Laptop(double cost, Battery battery, OperatingSystem os, Harddisk harddisk, Processor processor) {
		super();
		this.cost = cost;
		this.battery = battery;
		this.os = os;
		this.harddisk = harddisk;
		this.processor = processor;
	}
	
	@Override
	public String toString() {
		return "Laptop [cost=" + cost + ", battery=" + battery + ", processor=" + processor + "]";
	}
	
	

	
	
	
	

}
