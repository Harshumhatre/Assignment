package com.techno.synchronization;

public class Vivek extends Thread {

	Printer printer;

	public Vivek(Printer p) {
		super();
		this.printer = p;
	}

	@Override
	synchronized public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("printing the pages are done");
	}
}