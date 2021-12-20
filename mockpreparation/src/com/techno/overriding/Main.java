package com.techno.overriding;

public class Main {
public static void main(String[] args) {
	Employee employee = new Employee();
	employee.work();
	employee.walk();
	employee.sit();
	System.out.println("================");
	Parent parent = new Parent();
	parent.work();
	parent.walk();
	parent.sit();
}
}
