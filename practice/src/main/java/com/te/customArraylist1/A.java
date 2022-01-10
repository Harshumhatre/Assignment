package com.te.customArraylist1;

import java.util.Iterator;

public class A {
public static void main(String[] args) {
	MyaarayList myaarayList = new MyaarayList(2);
	myaarayList.add(10);
	myaarayList.add(20);
	myaarayList.add(30);
	myaarayList.add(40);
	myaarayList.add(70);
	myaarayList.add(50);
	//myaarayList.remove(2);
	System.out.println(myaarayList);
	Iterator iterator = myaarayList.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
