package com.te.customException2;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) throws Marks {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Marks");
		int marks = scanner.nextInt();
		if (marks<60) {
			throw new Marks("your Mock rating=Below Average");
		}
		else if (marks >= 60 && marks <= 70) {
			throw new Marks("your Mock rating=Average");
		} else if (marks > 71 && marks <= 80) {
			throw new Marks("your Mock rating=Above Average");
		} else {
			System.out.println("your Mock rating=Good");
		}
	}
}
