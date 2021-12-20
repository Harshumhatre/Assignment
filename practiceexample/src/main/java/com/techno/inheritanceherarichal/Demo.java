package com.techno.inheritanceherarichal;

public class Demo {
public static void main(String[] args) {
	
	Phone phone = new Phone();
	SmartPhone phone3=(SmartPhone)phone;
	
	phone.brand="one plus";
	phone.colour="Gray onion";
//	phone.cost=20000;
	phone.sim=2;
	System.out.println(phone.brand);
	System.out.println(phone.colour);
	System.out.println(phone.cost);
	System.out.println(phone.sim);
	phone.call();
	phone.design();
	SmartPhone smartPhone = new SmartPhone();
	smartPhone.typing();
	smartPhone.suffering();
	smartPhone.game();
	smartPhone.design();
	smartPhone.call();
	Mobile obj= new Mobile();
	System.out.println("Upcasting===================");
	obj.call();
	obj.game();
	Phone obj1=obj;
	obj1.call();
	System.out.println("Downcasting================");
	// Downcasting
	Mobile obj2=(Mobile)obj1;
	obj2.call();
	obj2.game();	
}
}
