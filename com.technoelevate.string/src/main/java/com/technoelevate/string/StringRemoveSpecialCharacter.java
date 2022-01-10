package com.technoelevate.string;

public class StringRemoveSpecialCharacter {
public static void main(String[] args) {
	String str="Technoelevate123@##%$#$";
	String obj=str.replaceAll("[^a-zA-Z]", "");
	System.out.println(obj);
	String obj1=str.replaceAll("[^0-9]", "");
	System.out.println(obj1);
}
}
