
public class Calculator {
	public static void test(int a,int b)
	{
		System.out.println("The addition is"+ (a+b));
		System.out.println("The substraction is"+ (a-b));
		System.out.println("The multiplication is"+ (a*b));
		System.out.println("The Division is"+ (a/b));
	}
	public static void test(int a,double b)
	{
		System.out.println("The addition is"+ (a+b));
		System.out.println("The substraction is"+ (a-b));
		System.out.println("The multiplication is"+ (a*b));
		System.out.println("The Division is"+ (a/b));
	}
	static void test(double a,int b)
	{
		System.out.println("The addition is"+ (a+b));
		System.out.println("The substraction is"+ (a-b));
		System.out.println("The multiplication is"+ (a*b));
		System.out.println("The Division is"+ (a/b));
	}
	static void test(double a,double b)
	{
		System.out.println("The addition is"+ (a+b));
		System.out.println("The substraction is"+ (a-b));
		System.out.println("The multiplication is"+ (a*b));
		System.out.println("The Division is"+ (a/b));
	}
	public static void main(String[] args) {
	 
	 test(10,20);
	}
}
