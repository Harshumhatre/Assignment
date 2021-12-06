package assignment3;

import java.util.Scanner;

public class EvenDigitSum {

	public static void getEvenDigitSum(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		getEvenDigitSum(num);
	}

}
