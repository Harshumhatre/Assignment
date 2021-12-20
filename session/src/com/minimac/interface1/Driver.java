package com.minimac.interface1;

public class Driver {
	void function(Car car) {
		car.start();
		car.brake();
		car.accelerate();
	}

	public static void main(String[] args) {
		Driver d = new Driver();
		RollsRoyce r = new RollsRoyce();
		Audi a = new Audi();
		d.function(a);
		System.out.println("-------------------------");
		d.function(r);
	}
}
