package com.te.mwthodreferance;

public class C {
public static void main(String[] args) {
	A a=new B()::m1;
	a.m1();
	a.m2();
}
}
