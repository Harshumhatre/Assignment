package com.te.deadlock;

public class DeadLock1 {
public static void main(String[] args) {
	final String Resource1="Harshad";
	final String Resource2="Rahul";
	Thread thread = new Thread() {
	public void run()
	{
	synchronized (Resource1) {
	System.out.println("Thread1 lock Resource1");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	synchronized (Resource2) {
	System.out.println("Thread1 lock Resource2");	
	}
	}
	};
	Thread thread1 = new Thread() {
		public void run()
		{
		synchronized (Resource2) {
		System.out.println("Thread2 lock Resource2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		synchronized (Resource1) {
		System.out.println("Thread2 lock Resource1");	
		}
		}
		};
		thread.start();
		thread1.start();
}
}
