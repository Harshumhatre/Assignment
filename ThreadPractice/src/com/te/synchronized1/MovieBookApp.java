package com.te.synchronized1;

public class MovieBookApp extends Thread {
	static BookTheterSeat b;
	int seat;
	public void run()
	{
	
	b.bookseat(seat);	
	}
public static void main(String[] args) {
	 b = new BookTheterSeat();
	 MovieBookApp m = new MovieBookApp();
	 m.seat=3;
	 m.start();
	 MovieBookApp m1 = new MovieBookApp();
	 m1.seat=2;
	 m1.start();
}
}
