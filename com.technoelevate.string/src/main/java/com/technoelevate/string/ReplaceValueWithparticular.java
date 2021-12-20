package com.technoelevate.string;

import java.util.Iterator;

public class ReplaceValueWithparticular {
public static void main(String[] args) {
	String str="opentext";
	char ch='t';
	int count=1;
	for (int i = 0; i < str.length(); i++) {
		char ch1=str.charAt(i);
		if (ch1==ch) {
	     str=str.replaceFirst(String.valueOf(ch1), String.valueOf(count));
			count++;
		}
	}
	System.out.println(str);
}	
}
		
