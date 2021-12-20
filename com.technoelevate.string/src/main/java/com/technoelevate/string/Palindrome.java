package com.technoelevate.string;

public class Palindrome {
public static void main(String[] args) {
	int num=121;
	int temp=num;
	int rev=0;
	while (temp!=0) {
		rev=rev*10+temp%10;
		temp=temp/10;
	}
	if (rev==num) {
		System.out.println("it's palindrome");
	}
	else
	{
		System.out.println("its not a palindrome");
	}
}
}
