package com.techno.join;

public class Mother extends Thread {
	Account account;
	public Mother(Account account)
	{
	super();
	this.account=account;
	}
	public void run()
	{
	for (int i = 1; i <10; i++) {
		account.deposit(10);
	}
	System.out.println("papa has completed their deposite" );
	}
}
