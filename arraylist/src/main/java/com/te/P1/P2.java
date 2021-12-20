package com.te.P1;

import java.util.ArrayList;

public class P2 {
public static void main(String[] args) {
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("sachin");
	a1.add("rohit");
	a1.add("Hardik");
	a1.remove("rohit");
	System.out.println(a1.size());
	for (String P2 : a1) {
		System.out.println(P2);	
	}
	System.out.println("=========================================");
	String []s=new String[a1.size()];
	s=a1.toArray(s);
	for (int i = 0; i < a1.size(); i++) {
	System.out.println(s[i]);	
	}
}
}
