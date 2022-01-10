package com.te.Treemap;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
	TreeSet treeSet = new TreeSet();
	treeSet.add("Harshad");
	treeSet.add("Rahul");
	treeSet.add("Vivek");
	treeSet.add("Manjunath");
	//treeSet.add(10);
	treeSet.add("Siddhu");
	System.out.println(treeSet);
	Iterator iterator = treeSet.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println("====================");
	for (Object object : treeSet) {
	System.out.println(object);	
	}
}
}
