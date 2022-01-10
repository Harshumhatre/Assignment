package com.te.glocery;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class MyClass {
	public static void main(String[] args) {
		GloceryStore g1 = new GloceryStore(1, "Sugar", 100);
		GloceryStore g2 = new GloceryStore(2, "Milk", 25);
		GloceryStore g3 = new GloceryStore(3, "Boost", 30);
		GloceryStore g4 = new GloceryStore(1, "Sugar", 100);
		GloceryStore g5= new GloceryStore(1,"Sugar", 1000);
		GloceryStore g6= new GloceryStore(1,"Sugashd", 1000);
		GloceryStore g7= new GloceryStore(6,"xgxwxvwsj", 10002);
		GloceryStore g8= new GloceryStore(7,"xgxwxvwsj", 10);
					
		LinkedHashSet<GloceryStore> linkedHashSet = new LinkedHashSet<GloceryStore>();
		linkedHashSet.add(g1);
		linkedHashSet.add(g2);
		linkedHashSet.add(g3);
		linkedHashSet.add(g4);
		System.out.print(linkedHashSet);
//	HashSet<GloceryStore> hashSet = new HashSet<GloceryStore>();
//	hashSet.add(g4);
//	hashSet.add(g3);
//	hashSet.add(g2);
//	hashSet.add(g1);
//	hashSet.add(g7);
//	hashSet.add(g6);
//	hashSet.add(g5);
//	System.out.print(hashSet);
	
	}
}
