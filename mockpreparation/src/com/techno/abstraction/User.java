package com.techno.abstraction;

public class User extends Atm{

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("the cash is withdraw");
	}

	@Override
	void debit() {
		// TODO Auto-generated method stub
		System.out.println("The amount is debitedd from your account");
	}

}
