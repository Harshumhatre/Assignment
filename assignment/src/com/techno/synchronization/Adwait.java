package com.techno.synchronization;

public class Adwait extends Thread {
	Printer printer;

	public Adwait(Printer printer) {
			super();
			this.printer = printer;
		}

	@Override
	synchronized public void run() {
		for (int i = 1; i <= 2; i++) {
			System.out.println(i);
		}
		System.out.println("Print are done");
	}

}
