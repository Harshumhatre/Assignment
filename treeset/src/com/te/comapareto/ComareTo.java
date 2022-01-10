package com.te.comapareto;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ComareTo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(1);
		t.add(2);
		t.add(10);
		t.add(5);
		t.add(19);
		t.add(-7);
		System.out.println(t);
		NavigableSet descendingSet = t.descendingSet();
		System.out.println(descendingSet);
//		NavigableSet descendingSet = t.descendingSet();
//		Iterator iterator = descendingSet.iterator();
//		while (iterator.hasNext()) {
//			
//			System.out.println(iterator.next());
//
//		}
		

	}
}
