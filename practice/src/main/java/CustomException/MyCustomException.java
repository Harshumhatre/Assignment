package CustomException;

import java.util.Scanner;

public class MyCustomException {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the age");
	int age=scanner.nextInt();
	if (age<18) {
		throw new BelowAge("This is not eligible for voting");
	}
	else if (age>=18) {
		throw new BelowAge("This is eligible for voting ");
	}
}
}
