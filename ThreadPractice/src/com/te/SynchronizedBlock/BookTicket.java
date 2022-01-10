package com.te.SynchronizedBlock;

public class BookTicket {
	int totalticket = 10;
	public void booltickets(int seat)
	{
		System.out.println("Hi"+Thread.currentThread().getName());
		System.out.println("Hi"+Thread.currentThread().getName());
		System.out.println("Hi"+Thread.currentThread().getName());
		System.out.println("Hi"+Thread.currentThread().getName());
		synchronized (this) {
			if (totalticket>=seat) {
				System.out.println("Your ticket are confirmed");
				totalticket=totalticket-seat;
				System.out.println("remaning tickets are left="+totalticket);
			} else {
				System.out.println("sorry...ticket are not remaning");
			}
		}
	}
	}
