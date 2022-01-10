package com.te.customarraylist;

import java.util.Iterator;

public class MyArrayList1 {
public static void main(String[] args) {
	CustomArraylist customArraylist = new CustomArraylist(2);
	customArraylist.add("Harshad");
	customArraylist.add("Vivek");
	customArraylist.add("Adwait");
	customArraylist.add("Siddhu");
	System.out.println(customArraylist);
	customArraylist.remove(2);
	System.out.println(customArraylist);
	Iterator iterator = customArraylist.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
