package com.techno.hasset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Classroom {
	public static void main(String[] args) {
		Student student1 = new Student(1, "harshu", 85);
		Student student5 = new Student(1, "harshu", 85);
		Student student2 = new Student(2, "vivek", 72);
		Student student3 = new Student(3, "rahul", 82);
		Student student4 = new Student(4, "adwait", 86);
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		hashSet.add(student5);
		Iterator<Student> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		ArrayList<Student> arrayList = new ArrayList<>(hashSet);
		Collections.sort(arrayList, new SortByName());
		System.out.println("===============================");
		Iterator<Student> iterator2 = arrayList.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
