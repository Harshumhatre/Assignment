package com.te.wait;

public class MovieBookApp {
public static void main(String[] args) throws Exception {
	TotalEarning obj = new TotalEarning();
	obj.start();
	//System.out.println("Total Earning"obj.total);
	synchronized (obj) {
		obj.wait();
		System.out.println("Total Earning ="+obj.total);
	}
}
}
