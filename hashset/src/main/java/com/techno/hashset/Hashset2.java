package com.techno.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Hashset2 {

public static void main(String[] args) {
SortedSet<String> sortedSet = new TreeSet<>();
	sortedSet.add("B");
	sortedSet.add("A");
	sortedSet.add("C");
	sortedSet.add("s");
	sortedSet.add("s");
	sortedSet.add("sharad");
	Iterator<String> iterator = sortedSet.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}

