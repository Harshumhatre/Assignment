package com.techno.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class hashsetString {
public static void main(String[] args) {
	HashSet<String> hashSet = new HashSet<String>();
	hashSet.add("Harshu");
	hashSet.add("Siddhu");
	hashSet.add("Harshu");
	hashSet.add("Vivek");
	HashSet<String> hashSet2 = new HashSet<String>();
	hashSet2.add("shubham");
	hashSet2.add("suraj");
	hashSet2.add("sharad");
	hashSet.addAll(hashSet2);
	hashSet2.addAll(hashSet);

	for (String string : hashSet2) {
		System.out.println(string);
	}
	Iterator<String> iterator = hashSet2.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
}
}
