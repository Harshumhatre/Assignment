package com.te.demonthread;

public class SleepMethods extends Thread {
public void run()
{
try {
	for (int i = 0; i < 5; i++) {
		sleep(1000);
		System.out.println("Red");
		sleep(1200);
		System.out.println("Blue");
		sleep(1400);
		System.out.println("Green");
	}
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}	
}
public static void main(String[] args) {
	SleepMethods sleepMethods = new SleepMethods();
	sleepMethods.start();
}
}
