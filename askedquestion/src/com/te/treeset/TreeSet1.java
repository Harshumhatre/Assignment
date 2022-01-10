package com.te.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
	TreeSet<String> treeSet = new TreeSet<String>();
	treeSet.add("R");
	treeSet.add("V");
	treeSet.add("M");
	treeSet.add("H");
	System.out.println(treeSet);
	Iterator<String> iterator = treeSet.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	for (String string : treeSet) {
		System.out.println(string);
	}
	System.out.println("---------------------");
	System.out.println(treeSet.descendingSet());
	System.out.println(	treeSet.addAll(treeSet));
	System.out.println(treeSet.clone());
	System.out.println(treeSet.contains("R"));
	System.out.println(treeSet.containsAll(treeSet));
}
}
