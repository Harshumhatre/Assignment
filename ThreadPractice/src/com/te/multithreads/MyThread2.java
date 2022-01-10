package com.te.multithreads;

public class MyThread2 extends Thread{
BookApp b;
int seat;
public MyThread2(BookApp b, int seat) {
	super();
	this.b = b;
	this.seat = seat;
}
public void run()
{
b.booktickets(seat);	
}
}
