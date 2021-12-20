package com.technoch.encapssulation;

public class College {
public static void main(String[] args) {
	Student student = new Student("Harshad",1,"Mecahnical", 83.30);
	System.out.println(student.getPercentage());
	student.setPercentage(92.0);
	System.out.println(student.getPercentage());
}
}
