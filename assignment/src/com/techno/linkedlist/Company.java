package com.techno.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Company {

	public static void main(String[] args) {
		LinkedList<Employee> list = new LinkedList<Employee>();
		list.add(new Employee(3, "Omkar", 500000));
		list.add(new Employee(2, "Suraj", 400000));
		list.add(new Employee(4, "Yogesh", 300000));
		list.add(new Employee(1, "Shubham", 20000));
		for (Employee e : list) {
			System.out.println(e);
		}
		System.out.println("Comparable	");
		System.out.println("===============");
		Collections.sort(list);
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println("Comparator");
		System.out.println("===============");
		Collections.sort(list,new SortByName());
		for(Employee e: list) {
			System.out.println(e);
		}
	}

}
