package com.technoch.hasa;

public class Owner {
public static void main(String[] args) {
	Battery battery = new Battery("LiPo","2.3"," 3");
	Processor processor = new Processor("Dual-Core 64 bit",2, 3.6);
	Laptop laptop = new Laptop(20000, battery, processor);
	System.out.println(laptop);
}
}
