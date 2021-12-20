package com.minimac.interface1;

public class Audi implements Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("cars start very noisy");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
	System.out.println("cars accelerate very quickly");	
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
	System.out.println("cars stop very fast");	
	}

}
