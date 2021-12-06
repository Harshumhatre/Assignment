package com.techno.challangearray;

public class SumWithDivisible3_5 {
	public static void main(String[] args) {
		int sum = 0;
		int temp = 0;
		System.out.print("Number divided by 3 & 5 are: ");
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");

				sum += i;
				temp++;
				if (temp == 5) {
					break;
				}
			}
		}
		System.out.println("\nSum = " + sum);

	}

}
