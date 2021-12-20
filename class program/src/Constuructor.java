
public class Constuructor {
	int a;
	int b;
	int c;
	Constuructor(int a, int b)
	{
		this(9);
		this.a=a;
		this.c=c;
		System.out.println("A is exicuted"+ a);
		System.out.println(b);
		System.out.println(a);
		
	}
	Constuructor(int c)
	{
		this.b=b;
		System.out.println("B is exicuted"+c);
	System.out.println(c);
	}
	
 public static void main(String[] args) 
 {
	  
	Constuructor obj2=new Constuructor (10,30);
	Constuructor obj1=new Constuructor (20);
}
}