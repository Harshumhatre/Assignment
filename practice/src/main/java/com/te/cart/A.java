package com.te.cart;

public class A extends Thread {
public void run()
{
	for (int i = 10; i < 15; i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
public static void main(String[] args) {
	A a = new A();
	for (int i = 0; i < 5; i++) {
		System.out.println(i);
		try {
			a.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	A a2 = new A();
	for (int i = 5; i < 10; i++) {
		System.out.println(i);
		try {
			a2.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	a.start();
	a2.start();
}
}
