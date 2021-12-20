package Interface;

public class A implements C,D {
		public void M2()
		{
			System.out.println("M2");
		}
	public static void main(String []args)
	{
		A obj=new A();
		obj.M2();
		C obj1=obj; //upcasting mandatory
		obj1.M2();
	}
	
}