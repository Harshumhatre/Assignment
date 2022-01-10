package com.te.ComparedTo;

import java.util.Comparator;

public class Employees implements Comparator<Employees> {
int id;
String name;
Double salary;
public Employees(int id, String name, Double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
//@Override
//public int compareTo(Employees o) {
//	// TODO Auto-generated method stub
//	return id-o.id;
//}
@Override
public int compare(Employees o1, Employees o2) {
	// TODO Auto-generated method stub
	return (int) (o1.salary-o2.salary);
}




}
