package com.te.polymorphism;

public class Main {
public static void main(String[] args) {
	Employee employee = new Employee();
	employee.walk();
	Parent parent = new Parent();
	parent.walk();
}
}
