package com.techno.today;

public class SortString {
public static void main(String[] args) {
	String str="harshad";
	char ch[]=str.toCharArray();
	char temp=0;
	for (int i = 0; i < ch.length; i++) {
		for (int j = i+1; j < ch.length; j++) {
			if (ch[i]>ch[j]) {
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
		if (temp>0) {
			System.out.print(ch[i]);
		}
	}
}
}
