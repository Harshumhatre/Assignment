package com.techno.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
public static void main(String[] args) {
	HashSet<Integer> hashset=new HashSet<Integer>();
	hashset.add(10);
	hashset.add(20);
	hashset.add(30);
	hashset.add(40);
	hashset.add(20);
	for(int x:hashset)
	{
		System.out.println(x);
	}
	Iterator <Integer>iterator=hashset.iterator();
	System.out.println("==================");
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
