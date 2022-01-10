package com.te.demonthread;

public class Test extends Thread {
public void run()
{
System.out.println("Deamon thread");
System.out.println(Thread.currentThread().getName());
}

public static void main(String[] args) {
	Test test = new Test();
	System.out.println(Thread.currentThread().getName());
	test.setDaemon(true);
	test.start();
	
}
}
