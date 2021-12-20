package com.te.checkedexception;

import java.util.Scanner;

public class Voting
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=scanner.nextInt();
		try {
		if (age<18) {
			throw new Uc1("You are not eligible for votting");
		} else {
			System.out.println("you can vote Succesfully");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("sorry");
		}
	}
}