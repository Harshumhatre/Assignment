package com.munna.zund;

import java.util.Scanner;

public class NthMaximumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		int a[] = new int[length];
		System.out.println("Enter the elements of the Array");
		for (int i = 0; i < length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the index which you want to Duplicate");
		int index = sc.nextInt();
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if (i == index - 1) {
				System.out.println(a[i]);
				break;
			}
		}

	}
}
