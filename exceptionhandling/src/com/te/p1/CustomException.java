package com.te.p1;

import java.util.Scanner;

import javax.xml.crypto.MarshalException;

public class CustomException {
public static void main(String[] args) throws Marks {
	CustomException customException = new CustomException();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the marks");
	int percentage=scanner.nextInt();
	if (percentage<=40 && percentage>=60) {
		throw new Marks("Average");
	} else if(percentage>=61 && percentage<=80){
		throw new Marks("Excellent");
	}
}
}
