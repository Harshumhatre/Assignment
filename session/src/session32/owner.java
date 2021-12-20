package session32;

public class owner {
public static void main(String[] args) {
	//Test obj=new Test();
	//obj.m1();
	//obj.m2();
	//Test1 obj1=new Test1();    // in method overriding we used static as well as instance method.
//	obj1.m1();
//	obj1.m2();
	//Upcasting
	Test t=new Test1();
	t.m1();
	//t.m2(); it gives an error
	//Downcasting
	Test1 t2=(Test1) t;
	t2.m1();
	//Test3  check
	t2.m2();
}
}
