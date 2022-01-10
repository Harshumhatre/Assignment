package MethodReferance;

public class C {
public static void main(String[] args) {
	A a=new B()::m1,m2;
	a.m1();
	a.m2();
}
}
