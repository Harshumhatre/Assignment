package com.techno.encapsulation;

public class Student {
	String name;
	private int Rollno;
	private double marks;
	private double percentage;
	private static String collegename;
	public Student(String name, int rollno, double marks, double percentage) {
		this.name = name;
		Rollno = rollno;
		this.marks = marks;
		this.percentage = percentage;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		
		if (marks>=0) {
			this.marks = marks;
		} else {
			System.out.println("invalid marks");
		}
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public static String getCollegename() {
		return collegename;
	}
	public static void setCollegename(String collegename) {
		Student.collegename = collegename;
	}
	

}
