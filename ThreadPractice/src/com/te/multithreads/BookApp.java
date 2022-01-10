package com.te.multithreads;

public class BookApp {
	int totalseats = 20;

	synchronized void booktickets(int seats) {
		if (totalseats >= seats) {
			System.out.println("your seats are booked" + totalseats);
			totalseats = totalseats - seats;
			System.out.println(totalseats + "seats are avilable");
		} else {
			System.out.println("your seats are not left ..sorry");
		}
	}
	1
}