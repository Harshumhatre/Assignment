package com.te.lambdaexpression;

public class MyClass {
	public static int sum(int i,int j)
	{
		return i+j;
	}
	public static int sub(int i,int j)
	{
		return i-j;
	}
	public static void main(String[] args) {
////		Test test = new Test() {
//
////			@Override
////			public void message() {
////				// TODO Auto-generated method stub
////				System.out.println("Namste guys");
////			}
////		};
////		test.message();
////		System.out.println("============================");
////		Test test1 = () -> {
////			System.out.println("vanakum guys");
////		};
////		test1.message();
//		System.out.println("================");
//		Test test1=(x,y)->
//		{
//			System.out.println(x+y);
//			
//		};
//		test1.add(10, 20);
//		System.out.println("================");
////		Test test2=(a,b)->
////		{
////			int add=test2.add(10, 40);
////			System.out.println(a+b);
////		};
//		Runnable Run=()->
//		{
//			for (int i = 0; i < 5; i++) {
//				System.out.println(i);
//			}
//		};
//		System.out.println("=======================");
//		Thread thread = new Thread(Run);
//		thread.start();
		
		Test test= MyClass::sum;
		System.out.println(test.add(10,20));
		Test test1= MyClass::sub;
		System.out.println(test1.add(10,20));
		
	}
	
}
