package com.technoelevate.string;

public class S3 {
public static void main(String[] args) {
	String str="  Ha@@#$%  rs$@%!   h%%!^a   ^@%d   ";
	String obj=str.replaceAll("\\s", "");
	String obj1=obj.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(obj1);
}
}
