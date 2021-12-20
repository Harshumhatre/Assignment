package com.mini.has1;

public class Function {
public static void main(String[] args) {
	Battery obj=new Battery(24, 23.30,45.3);
	Harddisk obj1=new Harddisk("wd", 234, 10);
	OperatingSystem obj2=new OperatingSystem("Window", 64, 3);
	Laptop obj4= new Laptop(30000, obj, obj2, obj1);
	System.out.println(obj4);
	
	
}
}
