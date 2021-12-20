package com.te.checkedexception;

public class Shy {
public static void main(String[] args) {
	System.out.println("1");
	try {
		System.out.println("2");
		int a=100;
		int b=0;
		int c;
		c=a/b;
		System.out.println("3");
		System.out.println(c);
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception handle by compiler");
		System.out.println("4");
	}
}
}
