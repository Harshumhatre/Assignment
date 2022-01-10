package com.te.wait;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class TotalEarning extends Thread {
int total=0;
public void run()
{
synchronized (this) {
	for (int i = 0; i < 30; i++) {
		total=total+650;
	}
	this.notify();
}	
}
public static void main(String[] args) throws InterruptedException {
	TotalEarning totalEarning = new TotalEarning();
	totalEarning.start();
	synchronized (totalEarning) {
		totalEarning.wait();
		System.out.println(totalEarning.total);
	}
}
}
