package com.array.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo {
public static void main(String[] args) {
	ArrayList list=new ArrayList(2);
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	Collections.sort(list);
	list.remove(1);
	System.out.println(list);
	list.add(40);
	Iterator iterator=list.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
}
}
