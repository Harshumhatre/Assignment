package com.techno.challangearray;

import java.util.Scanner;

public class TheRange {
	public boolean hasSharedDigit(int x, int y) {
		int firstnumberfirstdigit = x / 10;
		int firstnumberlastdigit = x % 10;
		int secondnumberfirstdigit = y / 10;
		int secondnumberlastdigit = y % 10;
		boolean result = true;

		if (x < 10 || x > 99 || y < 10 || y > 99) {
			result = false;
		}

		else if (firstnumberfirstdigit == secondnumberfirstdigit || firstnumberfirstdigit == secondnumberlastdigit
				|| firstnumberlastdigit == secondnumberlastdigit) {
			result = true;
		} else {
			result = false;
		}
		return result;

	}

	public static void main(String[] args) {
		TheRange obj = new TheRange();
		System.out.println(obj.hasSharedDigit(19,29));
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the first value of the range");
//		int num1=sc.nextInt();
//		System.out.println("Enter the first value of the range");
//		int num2=sc.nextInt();
//		System.out.println(hasSharedDigit(num1,num2));
	}
}