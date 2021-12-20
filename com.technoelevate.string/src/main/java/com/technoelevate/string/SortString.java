package com.technoelevate.string;

public class SortString {
public static void main(String[] args) {
	String str="zzAAccYyopp";
	System.out.println(str.toUpperCase());
	char[]ch=str.toUpperCase().toCharArray();
	char temp;
	for (int i = 0; i < ch.length; i++) {
		for (int j = i+1; j < ch.length; j++) {
			if (ch[i]>ch[j]) {
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
	}
	System.out.println(new String(ch));
	StringBuilder sb=new StringBuilder();
	for (int i = 0; i < ch.length; i++) {
		boolean repated=false;
		for (int j = i+1; j < ch.length; j++) {
			if (ch[i]==ch[j]) {
				repated=true;
				break;
			}
		}
		if (!repated) {
			sb.append(ch[i]);
		}
		
	}
	System.out.println(sb);
}
}
