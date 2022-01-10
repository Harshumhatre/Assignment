package com.te.methodsusedinthread;

public class GetSetCuurentThread extends Thread{
public void run()
{
System.out.println("Run");
System.out.println(Thread.currentThread().getName());
Thread.currentThread().setName("Yogesh");
System.out.println(Thread.currentThread().getName());

}
public static void main(String[] args) {
	GetSetCuurentThread gt = new GetSetCuurentThread();
	gt.start();
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("Harshad");
	System.out.println(Thread.currentThread().getName());
	//System.out.println(10/0);
	System.out.println(Thread.currentThread().isAlive());
	System.out.println(gt.isAlive());
}
}
