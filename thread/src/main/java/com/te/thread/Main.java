package com.te.thread;

public class Main {
	public static void main(String[] args) {
//		MyThread myThread = new MyThread();
//		Thread thread = new Thread(myThread);
//		thread.start();
//		System.out.println("program is running");
//		
		Runnable MyThread=new MyThread();
		Thread currentThread = Thread.currentThread();
		currentThread.setName("Rahul");
		System.out.println("The name is "+currentThread.getName());
		Thread thread = new Thread(MyThread);
		thread.setName("vivek");
		thread.start();
		System.out.println("the thread is "+currentThread.getId());
	}

}
