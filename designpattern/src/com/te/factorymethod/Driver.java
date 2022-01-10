package com.te.factorymethod;

public class Driver {
Car car;
public void driver(String s)
{
if (s.equalsIgnoreCase("audi")) {
	car=new Audi();
	car.start();
	car.accelerate();
	car.brake();
}	
if (s.equalsIgnoreCase("RollsRoyce"))
{
	car=new RollsRoyce();
	car.start();
	car.accelerate();
	car.brake();
}
if (s.equalsIgnoreCase("Tarzen"))
{
	car=new Tarzen();
	car.start();
	car.accelerate();
	car.brake();
	
}	
}
}
