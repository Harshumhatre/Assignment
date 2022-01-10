package com.te.threadcclass;

public class Test extends Thread {
	public void run() {
		System.out.println("thread task");
	}
public static void main(String[] args) {
	Test test = new Test();
	test.start();
	//test.start();
	
}
}
