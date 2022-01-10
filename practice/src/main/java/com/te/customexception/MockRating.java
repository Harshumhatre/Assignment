package com.te.customexception;

import java.util.Scanner;

public class MockRating {
public static void main(String[] args) throws customexception{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your marks");
	int marks=scanner.nextInt();
	if (marks<60) {
		throw new customexception("Average");
	} else if(marks<=71 && marks>=80) {
		throw new customexception("Above Average");
	} else if(marks<=81 && marks>=90) {
		throw new customexception("Good");
	}else
		System.out.println("Average");
}		
}
