package com.te.lambdaexpression;

public class B {
public static void main(String[] args) {
//	A a = new A() {
//		
//		@Override
//		public void substract(int x, int y) {
//			// TODO Auto-generated method stub
//		System.out.println(x-y);	
//		}
//	};
//	a.substract(10, 7);
//}
	A a;
	a=(x,y) -> System.out.println(x-y);
	a.substract(10, 9);
}
}
