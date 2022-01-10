package com.te.interpted;

public class MethodInteruptedAndIsInteruptedMethod extends Thread {
public void run() {
try {
	System.out.println(Thread.interrupted());
	//System.out.println(Thread.currentThread().isInterrupted());
	for (int i = 0; i < 5; i++) {
		
		System.out.println(i);
		Thread.sleep(1000);
		
	}
} catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
}	
}
public static void main(String[] args) throws Exception {
	MethodInteruptedAndIsInteruptedMethod m1 = new MethodInteruptedAndIsInteruptedMethod();
	m1.start();
	m1.interrupt();
	
}
}
