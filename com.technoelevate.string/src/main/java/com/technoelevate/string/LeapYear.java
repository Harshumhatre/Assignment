package com.technoelevate.string;

public class LeapYear {
public static void main(String[] args) {
	int year=2000;
	String res=(year%4==0&&year%100!=0||year%400==0)?"This is a leap year":"this is not a leap year";
	System.out.println(res);
}
}
