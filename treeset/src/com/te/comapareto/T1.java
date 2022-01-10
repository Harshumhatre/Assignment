package com.te.comapareto;

import java.util.TreeSet;

public class T1 {
public static <E> void main(String[] args) {
	TreeSet t = new TreeSet();
	t.add(10);
	t.add(0);
	t.add(15);
	t.add(20);
	t.add(20);
	System.out.println(t);
	System.out.println("===========================");
	TreeSet t1 = new TreeSet(new MyComparator());
	t1.add(100);
	t1.add(0);
	t1.add(15);
	t1.add(20);
	t1.add(20);
	System.out.println(t1);
}
}
