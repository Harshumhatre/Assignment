package com.te.multithreads;

public class BookApp1 {
public static void main(String[] args) {
 BookApp b = new BookApp();
//	 MyThread1 myThread1 = new MyThread1(b, 11);
//	 myThread1.start();
//	 MyThread2 myThread2 = new MyThread2(b, 10);
//	 myThread2.start();
 		MyThread1 myThread1 = new MyThread1(b, 11);
 		myThread1.start();
 		MyThread2 myThread2 = new MyThread2(b, 1);
 		
 		myThread2.start();
}
}
