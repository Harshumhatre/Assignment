package com.techno.join;

public class Main {
public static void main(String[] args) throws Exception {
	Account account = new Account(1000);
	Pappa pappa = new Pappa(account);
	Mother mother = new Mother(account);
	pappa.start();
	mother.start();
	
	pappa.join();
	mother.join();
	System.out.println("Waiting completed");
	account.checkbalance();
}
}
