package com.te.wait;

public class TotalEarning extends Thread {
int total=0;
public void run()
{
synchronized (this) {
	for (int i = 0; i < 30; i++) {
		total=total+100;
	}
this.notify();
}	
}
public static void main(String[] args) {
	TotalEarning totalEarning = new TotalEarning();
	totalEarning.start();
	totalEarning.wait();
	synchronized (obj) {
		
	}
}
}
