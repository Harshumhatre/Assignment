package com.techno.today;

public class SortArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7,8,9,10 };
		int i = 0;
		int temp;
		while (i < a.length) {
			temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
			i = i + 2;
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
}
