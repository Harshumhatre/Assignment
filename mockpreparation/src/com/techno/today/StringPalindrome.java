package com.techno.today;

public class StringPalindrome {
public static void main(String[] args) {
	String str="nitinh";
	String rev="";
	char ch[]=str.toCharArray();
	for (int i = ch.length-1; i >=0; i--) {
		rev=rev+str.charAt(i);
	}
	if (rev.equals(str)) {
		System.out.println("its palindrome");
	} else {
		System.out.println("it's not palindrome");
	}
}
}
