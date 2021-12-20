package com.techno.hashset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
TreeSet treeSet = new TreeSet<>();
	treeSet.add(10);
	treeSet.add(20);
	treeSet.add(30);
	treeSet.add(40);
	treeSet.add(-10);
	treeSet.add(-20);
	for(Object obj:treeSet)
	{
		System.out.println(obj);
	}
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	ListIterator<Integer> listIterator = arrayList.listIterator(arrayList.size());
	while (listIterator.hasPrevious()) {
		System.out.println(listIterator.previous());
	}
}
}
