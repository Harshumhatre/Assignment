package com.te.joinmethod;

import java.util.Iterator;

public class JoinMethod extends Thread {
//	static Thread t;
public void run()
{
try {
	
//	t.join();
	for (int i = 0; i < 5; i++) {
		Thread.sleep(1000);
		System.out.println("Main-1");
	}
} catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
}	
}
public static void main(String[] args) throws Exception{
//	 t=Thread.currentThread();
	JoinMethod joinMethod = new JoinMethod();
	
	//joinMethod.join();     //join method is used always in last of the start method then 
							//then it executed run()method 1 AND then main method thread.
	
	try {
		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			System.out.println("Main-2");
		}	
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	joinMethod.yield();
	joinMethod.start();
	
}
}
