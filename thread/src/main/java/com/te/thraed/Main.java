package com.te.thraed;

public class Main {
public static void main(String[] args) {
	Demo demo = new Demo();
	demo.start();
	for (int i = 10; i < 20; i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
}
