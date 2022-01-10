package com.tech.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList arrayList = new ArrayList(2);//<E>generics= it is used for what kind of object we are stored in that.
	arrayList.add("rahul");        
	arrayList.add("Harshad");
	arrayList.add("Hemanth");
	arrayList.add("Siddhu");
	arrayList.add("Adwait");
	arrayList.add("vivek");
//	Collections.sort(arrayList);
//	System.out.println(arrayList);
//	Collections.reverse(arrayList);
	System.out.println(arrayList);
	arrayList.remove(0);
//	System.out.println(arrayList);
//	System.out.println("+=====================");
//	//arrayList.remove(3);
//	System.out.println(arrayList);
//	Collections.swap(arrayList, 0, 4);
//	System.out.println(arrayList);
////	arrayList.removeAll(arrayList);
////	System.out.println(arrayList);
////	System.out.println(arrayList);
	Iterator iterator = arrayList.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
