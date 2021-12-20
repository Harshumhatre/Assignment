package com.techno.typecasting;

public class User {
public static void main(String[] args) {
	SmartPhone smartPhone = new SmartPhone();
	smartPhone.call();
	smartPhone.application();
	 
	
	
	Mobile obj1 = new SmartPhone();
	obj1.call();
	obj1.message();
	
	System.out.println("upcasting.........");
	Telephone obj = new SmartPhone();
	obj.call();
	

	System.out.println("Downcasting........");
	SmartPhone smartPhone2 = new SmartPhone();
	Telephone obj2=(Telephone)smartPhone2;
	obj2.call();
}
}
