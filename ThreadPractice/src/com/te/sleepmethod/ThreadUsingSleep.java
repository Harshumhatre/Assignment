package com.te.sleepmethod;

public class ThreadUsingSleep extends Thread {
public void run() {
	try {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(500);
			System.out.println("Light -red");
			Thread.sleep(1000);
			System.out.println("Light -blue");
			Thread.sleep(1500);
			System.out.println("Light -green");
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
public static void main(String[] args) {
	ThreadUsingSleep threadUsingSleep = new ThreadUsingSleep();
	threadUsingSleep.start();
}
}
