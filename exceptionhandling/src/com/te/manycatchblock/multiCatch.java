package com.te.manycatchblock;

import java.util.Scanner;

public class multiCatch {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the first element");
	int i=scanner.nextInt();
	System.out.println("enter the second elements");
	int j=scanner.nextInt();
	try {
		int x=i/j;
	} catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
//	catch (ArithmeticException e) {
//		// TODO: handle exception
//		e.printStackTrace();
//	}
}
}
