package com.te.customE;

import java.util.Scanner;

public class MyCustomException {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your Marks");
	int marks=scanner.nextInt();
	if (marks<60) {
		throw new Marks("Below Average");
	} else if(marks>=61&&marks<=70) {
		throw new Marks("Average");
	}
	 else if(marks>=71&&marks<=80) {
			throw new Marks("Above Average");
		}
	 else if(marks>=81&&marks<=100) {
			//throw new Marks("Good");
		 System.out.println("Good");//why we used this 
		 //println bcz there is no indication of red mark
		 // so to know eater it is exceptiom or not we used 
		 //throw keyword
		}
}
}
