package com.techno.challangearray;

public class Factors {
	public static void printFactors(int number) {

		if (number < 1) {
			System.out.println("Invalid Value");
		}

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Factors obj = new Factors();
		obj.printFactors(10);
	}
}
