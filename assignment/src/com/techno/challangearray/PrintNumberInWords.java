package com.techno.challangearray;

import java.util.Scanner;

public class PrintNumberInWords {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String print[];
			String str = "ZERO ONE TWO THREE FOUR FIVE SIX SEVEN EIGHT NINE";
			print = str.split(" ");
			int number[] = {0,1,2,3,4,5,6,7,8,9};
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number");
			int num = scan.nextInt();
			System.out.println("Result = "+print [num]);
			
		}

	}