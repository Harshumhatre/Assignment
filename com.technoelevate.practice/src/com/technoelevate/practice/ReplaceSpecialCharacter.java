package com.technoelevate.practice;

public class ReplaceSpecialCharacter {
public static void main(String[] args) {
	String str="@!J$#A$$V$^&A";
	System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
}
}
