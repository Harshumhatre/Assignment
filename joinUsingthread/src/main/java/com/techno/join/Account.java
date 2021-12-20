package com.techno.join;

public class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("Insufficiant balance");
		} else {
			balance = balance - amount;
		}
	}

	synchronized  void deposit(int amount) {
		balance = balance + amount;
	}

	public void checkbalance() {
		System.out.println(balance);
	}
}
