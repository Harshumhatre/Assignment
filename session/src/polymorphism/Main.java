package polymorphism;

public class Main { 
	public static void main(String[] args) {
	Test test=new Test();
	test.M1();
	System.out.println(test.x);
	System.out.println("------------------");
	Demo demo=new Demo();
	demo.M1();
	System.out.println(demo.x);
	System.out.println("------------------");
	 Test obj=new Demo();
	 obj.M1();           //method exicuted of its child because of upcasting.
	 System.out.println(obj.x);// but there is method overhi
	 System.out.println("------------------");
	 
 }
}
