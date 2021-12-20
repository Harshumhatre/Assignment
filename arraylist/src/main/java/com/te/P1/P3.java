 package com.te.P1;

import java.util.ArrayList;
import java.util.Iterator;

public class P3 {
public static void main(String[] args) {
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("sachin");
	a1.add("rohit");
	a1.add("Hardik");
	Iterator i=a1.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
	}
}
}
