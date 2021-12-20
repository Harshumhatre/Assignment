package com.te.P1;

import java.util.ArrayList;

public class P1 {
public static <E> void main(String[] args) {
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("Harshad");
	a1.add("Siddhu");
	a1.add("Adwait");
	System.out.println(a1.get(0));
	System.out.println(a1.get(1));
	System.out.println(a1.get(2));
	System.out.println("===========================");
	a1.set(0, "Harsh");  // set method is used to update the value
	a1.set(1, "sid");
	a1.set(2, "adu");
	System.out.println(a1.get(0));
	System.out.println(a1.get(1));
	System.out.println(a1.get(2));
	if (a1.contains("Harshad")) { //contains are used for the the given elements is present are not. 
		System.out.println("It is presenr");
	} else {
		System.out.println("It is not Present");
	}
	if (a1.contains("Harsh")) {
		System.out.println("It is present");
	} else {
		System.out.println("It is not present");
	}
	System.out.println("================================");
	for (int i = 0; i < a1.size(); i++) {
		System.out.println(a1.get(i));
	}
	System.out.println("++++++++++++++++++++++++++++++++++++++++");
	for (String P1 : a1) {
		System.out.println(P1);
	}
}
}
