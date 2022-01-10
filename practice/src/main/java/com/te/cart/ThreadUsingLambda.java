package com.te.cart;

public class ThreadUsingLambda {
public static void main(String[] args) {
	Runnable r1=()->{
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	Thread thread = new Thread(r1);
	thread.start();
	Runnable r2=()->{
		for (int i = 6; i < 11; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	Thread thread2 = new Thread(r2);
	thread2.start();

}
}
