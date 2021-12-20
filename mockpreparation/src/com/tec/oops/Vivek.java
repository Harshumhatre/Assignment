package com.tec.oops;

public class Vivek implements Activity{
int age;
String location;
private double sal;
public Vivek(int age, String location, double sal) {
	super();
	this.age = age;
	this.location = location;
	this.sal = sal;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public void walk() {
	// TODO Auto-generated method stub
	System.out.println("it's walks very slowly");
}
@Override
public void play() {
	// TODO Auto-generated method stub
	System.out.println("it's playing  very well na");
}
@Override
public void eat() {
	// TODO Auto-generated method stub
	System.out.println("they are eating a food");
}
@Override
public String toString() {
	return "Vivek [age=" + age + ", location=" + location + ", sal=" + sal + "]";
}

}
