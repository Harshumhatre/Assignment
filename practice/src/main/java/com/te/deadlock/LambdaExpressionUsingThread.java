package com.te.deadlock;

public class LambdaExpressionUsingThread {
public static void main(String[] args) {
	Runnable r=()->{
		for (int i = 0; i <5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	};
	Thread thread = new Thread(r);
	thread.start();
}
}
