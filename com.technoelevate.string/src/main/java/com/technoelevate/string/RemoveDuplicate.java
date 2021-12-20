package com.technoelevate.string;

public class RemoveDuplicate {
public static void main(String[] args) {
	String str="harshad";
	char[]ch=str.toCharArray();
	StringBuilder sb=new StringBuilder();
	for (int i = 0; i<ch.length; i++) {
		boolean repated=false;
		for (int j = i+1; j < ch.length; j++) {
		if(ch[i]==ch[j])
		{
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
