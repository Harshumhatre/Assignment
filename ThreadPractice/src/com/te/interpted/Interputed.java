package com.te.interpted;

public class Interputed extends Thread {
public void run()
{
try {
	
	for (int i = 0; i < 5; i++) {
		System.out.println(i);
		Thread.sleep(1000);
	}
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("Inteputetion happen at "+ e);
}	
}
public static void main(String[] args) {
	Interputed interputed = new Interputed();
	interputed.start();
	interputed.interrupt();
}
}
