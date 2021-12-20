package com.technoe.static1;

public class P1 {
	static int a=200;
	{
		 System.out.println(a);
		System.out.println("non static block-1");
	}
		static 
		{
			System.out.println("static block-1");
		}
		static 
		{
			System.out.println("static block-2");
			System.out.println(a);
		}
		static 
		{
			System.out.println("static block-3");
			int num=10;
			demo(num);
			test(num);
			{
				System.out.println("non static block-2");
			}
		}
		public static void test(int n)
		{
		System.out.println(n+n);
		System.out.println(a);
		}
		public static void demo(int n)
		{
		System.out.println(n/n);		
		}
		public static void main(String[] args) 
		{
		P1 p1 = new P1();
			System.out.println("Hello World!");
			System.out.println(a);
		}
	}

