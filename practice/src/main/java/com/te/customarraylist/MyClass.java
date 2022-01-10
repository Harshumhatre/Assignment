package com.te.customarraylist;

import java.util.Iterator;

public class MyClass {
public static void main(String[] args) {
	MyArraylist m1 = new MyArraylist(2);
	m1.add(10);
	m1.add(20);
	m1.add(30);
	m1.add(40);
	m1.add(50);
	m1.add(60);
	System.out.println(m1);
	m1.remove(2);
	
	System.out.println(m1);
	Iterator iterator = m1.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
