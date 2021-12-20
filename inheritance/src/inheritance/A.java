package inheritance;

public class A {
int x;
static int y;
static int m1()
{
	System.out.println("Static block-1");
	return y;
}
static int m2()
{
	System.out.println("Static block-2");
    return y;   
}
int m3()
{
	System.out.println("non static block-3");
return y;
}
int m4()
{
	System.out.println("non static block-4");
	return x;
}
}
