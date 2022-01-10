package com.te.mwthodreferance;

public interface A {
public void m1();
default void m2()
{
System.out.println("m2 is executed");	
}
}
