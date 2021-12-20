package com.techno.join;

public class Pappa extends Thread {
Account account;
public Pappa(Account account)
{
super();
this.account=account;
}
public void run()
{
for (int i =0 ; i <100; i++) {
	account.deposit(200);
}
System.out.println("papa has completed their deposite" );
}
}
