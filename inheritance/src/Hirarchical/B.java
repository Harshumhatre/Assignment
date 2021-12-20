package Hirarchical;

public class B extends A{
	static void m3()
	{
		System.out.println("third");
	}
	void m4()
	{
		System.out.println("fourth");
	}
	public static void main(String[] args) {
		B obj=new B();
		obj.m3();
		obj.m4();
	}

}
