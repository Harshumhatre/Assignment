package com.techno.abstraction;

public class Main {
public static void main(String[] args) {
	User user = new User();
	user.debit();
	user.withdraw();
	Atm.checkbalance();
}
}
