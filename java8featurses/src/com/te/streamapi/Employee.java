package com.te.streamapi;

public class Employee {
	int id;
String name;
String designation;
int age;
double salary;

public Employee(int id, String name, String designation, int age, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.designation = designation;
	this.age = age;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age + ", salary="
			+ salary + "]";
}


}
