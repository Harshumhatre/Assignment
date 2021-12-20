package com.technoelevate.string;

import javax.swing.text.StyledEditorKit.ForegroundAction;
public class Reverse {     //Reverse String In 4 Ways
	public static void main(String[] args) {
		String str=" my name is HARSHAD";
		char [] ch=str.toCharArray();
		for (int i =ch.length-1; i >=0; i--) {
			System.out.print(ch[i]);
			
		}
		System.out.println();
		System.out.println("--------------------");
		for (int i =str.length()-1; i >=0; i--) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		System.out.println("---------------------");
		StringBuffer obj=new StringBuffer(str);
		System.out.println(obj.reverse());
		System.out.println();
		System.out.println("-----------------------");
		StringBuilder obj1=new StringBuilder(str);
		System.out.println(obj1.reverse());
				
	}
}
