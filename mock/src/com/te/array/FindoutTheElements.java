package com.te.array;

import java.util.Scanner;

public class FindoutTheElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array");
		int length = sc.nextInt();
		System.out.println("Enter the index");
		int index = sc.nextInt();
		System.out.println("Enter the elements of array");
		int a[] = new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if (i == index) {
				System.out.println(a[i]);
			}
			
		}
	}
}
