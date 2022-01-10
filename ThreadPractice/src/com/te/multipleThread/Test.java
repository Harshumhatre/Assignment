package com.te.multipleThread;

public class Test extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println("Video is on runnimg position");
				System.out.println("Sound is also Running position");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.start();
	}
}
