package inheritance;

public class c {
	public static void main(String[] args) {
		{
			A obj=new A();
			A.m1();
			A.m2();
			obj.m3();
			obj.m4();
			B obj2=new B();
			B.m1();
			B.m2();
			obj2.m3();
			obj2.m4();
			
		}
	}

}
