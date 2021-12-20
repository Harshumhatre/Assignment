package com.technoelevate.string;

public class Str1 {  //Palindrome
	public static void main(String[] args) {
		String str="nitin";
		String rev="";
		for (int i = str.length()-1; i>=0 ; i--) {
			rev=rev+str.charAt(i);
		}
		if (rev.equals(str)) {
			System.out.println("this is a palindrome");
		}
		else
		{
			System.out.println("this is not a palindrome");
		}
	}
}
