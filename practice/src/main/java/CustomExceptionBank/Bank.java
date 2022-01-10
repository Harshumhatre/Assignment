package CustomExceptionBank;

import java.util.Scanner;

import com.te.customexception.customexception;

public class Bank {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the balance");
	double balance=scanner.nextDouble();
	System.out.println("Enter the withdraw amount");
	double withdraw_amount=scanner.nextDouble();
	
	
	if (balance>=withdraw_amount) {
		balance=balance-withdraw_amount;
		System.out.println("Transition Completed."+"Now avilable balance is"+balance);
	}
	else {
		balance=balance-withdraw_amount;
		throw new customexception("insufficient balance"+ " avilable balance is =0.0");
	}
}
}
