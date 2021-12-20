package com.munna.zund;

import java.util.Scanner;

public class DuplicatesArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		int a[] = new int[length];
		System.out.println("Enter the elements of the Array");
		for (int i = 0; i < length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					temp = temp + 1;
					break;
				}
			}

			if (temp > 0) {
				System.out.println(a[i]);
				break;
			}
		}

	}
}
