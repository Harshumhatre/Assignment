package com.te.methodreferance;

public class Demo {
public static void main(String[] args) {
	A a=new B()::m1;
	a.m1();
	
}
}
