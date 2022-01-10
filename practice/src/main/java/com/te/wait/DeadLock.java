package com.te.wait;

public class DeadLock {
public static void main(String[] args) {
	final String resource1="Harshad";
	final String resource2="rahul";
	Thread thread = new Thread() {
		public void run() {
			synchronized (resource1) {
			try {
				System.out.println("Thread1 lock resource1");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (resource2) {
				System.out.println("Thread1 lock resource2");
			}
			
			}
		}
	};
	Thread thread1 = new Thread() {
		public void run() {
			synchronized (resource2) {
			try {
				System.out.println("Thread2 lock resource2");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (resource1) {
				System.out.println("Thread2 lock resource1");
			}
			
			}
		}
	};
	thread.start();
	thread1.start();
}
}