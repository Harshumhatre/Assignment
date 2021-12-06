package com.techno.synchronization;

public class Shop {
		public static void main(String[] args) throws Throwable {
			// TODO Auto-generated method stub
			Printer printer = new Printer(0);
			Vivek Vivek = new Vivek(printer);
			Adwait adwait = new Adwait(printer);
			Vivek.start();
			adwait.start();
			Vivek.join();
			adwait.join();
			System.out.println("Executed");
			printer.printed();
		}

	}
