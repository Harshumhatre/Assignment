package com.teimportantproblems;

public class ThreadUsingLambdaExpression {
public static void main(String[] args) {
	Runnable r=()->{
		try {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
			}
		}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	};
	Thread thread = new Thread(r);
	thread.start();
	Runnable r1=()->{
		try {
			for (int i = 11; i < 20; i++) {
				System.out.println(i);
				Thread.sleep(1500);
			}
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		
	};
	Thread thread2 = new Thread(r1);
	thread2.start();
}
}
