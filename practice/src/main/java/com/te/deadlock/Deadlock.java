package com.te.deadlock;

public class Deadlock {
	public static void main(String[] args) {
		final String resource1 = "Harshad";
		final String resource2 = "Rahul";
		Thread thread = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("thread1 resourse1");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					synchronized (resource2) {
						System.out.println("thread1 resourse2");
					}
				}
			}
		};
		Thread thread2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("thread2 resourse2");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					synchronized (resource1) {
						System.out.println("thread2 resourse1");
					}
				}
			}
		};
		thread.start();
		thread2.start();
	}
}
