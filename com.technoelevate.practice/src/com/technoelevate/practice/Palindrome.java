package com.technoelevate.practice;

public class Palindrome {
public static void main(String[] args) {
	String str="Nitin";
	String str1=str.toUpperCase();
	String rev="";
	for (int i = str1.length()-1; i>=0; i--) {
		rev=rev+str1.charAt(i);
	}
		if (str1.equals(rev)) {
			System.out.println("it is a palindrome");
		} else {
			System.out.println("it is not a palindrome");
		}
}
}
