package methods;

public class Demo {
	int a,b;
	Demo(int a){
		this.a=a;
		System.out.println("Enterw");
	}
	Demo(int a,int b)
	{
		this(a);
		this.b=b;
	}
public static void main(String[] args) {
	Demo obj=new Demo(1);  
	Demo obj1=new Demo(5,4);
	System.out.println(obj.a);
	System.out.println(obj1.a);
	System.out.println(obj1.b);
}
}
