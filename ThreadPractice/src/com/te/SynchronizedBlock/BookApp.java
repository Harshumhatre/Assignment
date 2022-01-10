package com.te.SynchronizedBlock;

public class BookApp extends Thread {
	static BookTicket b;
	int seat;
	public void run()
	{
	b.booltickets(seat);
	}
public static void main(String[] args) {
	 b = new BookTicket();
	BookApp b1 = new BookApp();
	b1.seat=3;
	b1.start();
	BookApp b2 = new BookApp();
	b2.seat=4;
	b2.start();
}
}
