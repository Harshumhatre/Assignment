package Inheritance;

import java.util.Iterator;

public class Stringspilt {
public static void main(String[] args) {
	String str="hi this is harshad";
	String res[]=str.split(" ");
	for (int i = res.length-1; i >= 0; i--) {
	System.out.println(res[i]);	
	}
	
//	for (int i = str.length()-1; i >=0; i--) {
//		System.out.print(str.charAt(i));
//	}
//	String[] res=str.split(" ");
//	for (int i =str.length()-1 ; i >= 0; i--) {
//		System.out.println(ch[i]);
	}
}
