package com.te.syncheonized;

public class MyApp extends Thread{
	static BookTicket b;
	int seat;
	public void run() {
		b.bookticket(seat);
	}
public static void main(String[] args) {
	 b = new BookTicket();
	 MyApp m = new MyApp();
	 m.seat=3;
	 m.start();
	 MyApp m1 = new MyApp();
	 m1.seat=4;
	 m1.start();
	 MyApp myApp = new MyApp();
	 myApp.seat=7;
	 myApp.start();
	 
}
}
