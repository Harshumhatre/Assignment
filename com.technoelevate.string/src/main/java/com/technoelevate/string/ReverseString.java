package com.technoelevate.string;
import java.util.Iterator;
public class ReverseString {
public static void main(String[] args) {
	String str="NitIn";
	String str1=str.toUpperCase();
	String rev="";
	for (int i = str1.length()-1; i>=0 ; i--) {
		rev=rev+str1.charAt(i);
	}
	if (str1.equals(rev)) {
	System.out.println("it's is a palindrome string");	
	}
	else {
		System.out.println("it's not a palindrome ");
	}		
}
}
