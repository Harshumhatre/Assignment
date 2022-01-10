package com.te.stop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Myclass {
public static void main(String[] args) {
	ArrayList<Employee> arrayList = new ArrayList<Employee>();
	arrayList.add(new Employee(1,"vivek", 10000));
	arrayList.add(new Employee(2,"Harshad", 20000));
	arrayList.add(new Employee(3,"rahul", 30000));
	arrayList.add(new Employee(4,"sidhhu", 10000));
	arrayList.add(new Employee(5,"manju", 25000));
	Collections.sort(arrayList,new Salary());
	Collections.reverse(arrayList);
	Iterator<Employee> iterator = arrayList.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println("======================================");
// 	ListIterator<Employee> listIterator = arrayList.listIterator();
//	while (listIterator.hasPrevious()) {
//		System.out.println(listIterator.previous());
//	}
	
}
}
