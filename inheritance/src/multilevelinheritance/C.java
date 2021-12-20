package multilevelinheritance;

import multilevelinheritance.A;
import multilevelinheritance.B;
import multilevelinheritance.C;

public class C extends B {
	public static void main(String[] args) {
		C.m1();
		C.m3();
		A obj=new A();
		obj.m2();
		B obj1 =new B();
		obj1.m4();
	}

}
