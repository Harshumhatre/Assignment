package MethodReferance;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

interface A {
public void m1();
default void m2()
{
System.out.println("m2 executed");	
}
}
