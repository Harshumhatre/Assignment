package com.techno.encapsulation;

public class College {
public static void main(String[] args) {
	Student student = new Student("Harshad",10,510,83.80);
//	System.out.println(student.name);
//System.out.println(student.getMarks());
//	student.setMarks(610);
//	System.out.println("=======================");
//	System.out.println(student.getMarks());
//
	student.setMarks(-1);
	System.out.println(student.getMarks());
}
}
