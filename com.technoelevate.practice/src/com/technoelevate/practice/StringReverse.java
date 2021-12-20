package com.technoelevate.practice;

import java.util.Iterator;

public class StringReverse {
public static void main(String[] args) {
	String str="harshad";
	char[]ch=str.toCharArray();
	for (int i = ch.length-1; i >=0; i--) {
		System.out.print(ch[i]);
	}
	System.out.println();
	for (int i =str.length()-1; i>=0; i--) {
		System.out.print(str.charAt(i));
	}
	System.out.println();
	StringBuffer obj=new StringBuffer(str);
	System.out.println(obj.reverse());
	System.out.println();
	StringBuilder obj1= new StringBuilder(str);
	System.out.println(obj1.reverse());
}
}
