package com.techno.challangearray;

import java.util.Scanner;

public class SumOfFirstALastDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		num = 324;
		int fd;
		int ld;
		int sum;
		ld = num % 10;
		while (num > 10) {
			num = num / 10;
		}
		fd = num;
		System.out.println("First Digit = " + fd);
		System.out.println("Last Digit = " + ld);
		sum = fd + ld;
		System.out.println("Total Sum = " + sum);
	}
}