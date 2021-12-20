package com.te.thread;

public class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		// TODO Auto-generated method stub
//		for (int i = 0; i <10; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//			}
//		}
	}

}
