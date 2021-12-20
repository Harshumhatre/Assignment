package com.technoelevate.string;

public class Split {
	public static void main(String[] args) {
String str="My name is Dhoni";
String []res=str.split(" ");
 for (int i = res.length-1; i>=0; i--) {
	System.out.println(res[i]);
}
}
}