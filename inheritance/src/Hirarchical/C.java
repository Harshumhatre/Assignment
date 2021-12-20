package Hirarchical;

public class C extends A{
	static void m5()
	{
		System.out.println("Fifth");
	}
	void m6()
	{
		System.out.println("Sixth");
		
	}
	public static void main(String[] args) {
		C.m1();
		C.m5();
		C obj=new C();
		obj.m2();
		obj.m6();	
	}
	
}
