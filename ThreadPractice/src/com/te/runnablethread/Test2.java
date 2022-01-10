package com.te.runnablethread;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("From ThreadClass-1");
	}
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		Thread thread = new Thread(test2);
			thread.start();
	}

}
