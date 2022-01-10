package com.te.multithreads;

public class MyThread1 extends Thread {
	BookApp b;
	int seats;

	

	public MyThread1(BookApp b, int seats) {
		super();
		this.b = b;
		this.seats = seats;
	}



	public void run() {
		b.booktickets(seats);
	}
}
