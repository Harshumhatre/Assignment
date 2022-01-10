package com.te.ComparedTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Myclass {
public static void main(String[] args) {
	ArrayList<Employees> arrayList = new ArrayList<Employees>();
	arrayList.add(new Employees(1, "Vivek", 2000.0));
	arrayList.add(new Employees(1, "h",1000.));
	arrayList.add(new Employees(4, "s",50000.));
	arrayList.add(new Employees(2, "h",10000.));
	Collections.sort(arrayList,new Salary());
	Iterator<Employees> iterator = arrayList.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println("=============================");
	for (Employees employees : arrayList) {
		System.out.println(employees);
	}
	System.out.println("==============================");
}
}
