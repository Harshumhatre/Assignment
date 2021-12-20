package com.technoelevate.string;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of the array");
	int length =sc.nextInt();
	System.out.println("Enter the index of the array");
	int index=sc.nextInt();
	System.out.println("Enter the elements of the array");
	int a[]=new int[length];
	for (int i = 0; i < length; i++) {
		a[i]=sc.nextInt();
	}
	int temp=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]==a[j]) {
		System.out.print(" "+a[i]);
	}
}
	}
}
}