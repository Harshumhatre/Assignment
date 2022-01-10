package com.te.yeild;

public class Yeild extends Thread {
public void run()
{
	Thread.yield();	
for (int i = 0; i < 5; i++) {
	System.out.println(Thread.currentThread().getName()+" "+i);
}	
}
public static void main(String[] args) {
	Yeild yeild = new Yeild();
	
	yeild.start();
	for (int i = 0; i < 5; i++) {
		System.out.println(Thread.currentThread().getName()+" "+i);
	}
}
}
