package com.technoelevate.string;

public class StringRemoveSpecialCharacter {
public static void main(String[] args) {
	String str="@J#A^#%V!#(A";
	String obj=str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(obj);
	
}
}
