package com.te.thraed;

public class Demo  extends Thread {
	public void run()
	{
		for (int i = 0; i <10; i++) {
			if (i==3) {
				throw  new ArrayIndexOutOfBoundsException();
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
