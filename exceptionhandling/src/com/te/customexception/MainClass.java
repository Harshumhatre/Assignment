package com.te.customexception;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the age");
	int age=scanner.nextInt();
	if (age>40) {
		throw new ToOldException("plzz wait some more time......");
	} else if(age<20){
		throw new ToYoungException("after 20 ....");	
	}
	else
	{
		System.out.println("ok..you will get details by email.");
	}
}
}
