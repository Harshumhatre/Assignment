package com.te.lambdaExapression1;

public class B {
public static void main(String[] args) {
//	A obj = new A() {
//		
//		@Override
//		public void substract(int x, int y) {
//			// TODO Auto-generated method stub
//		System.out.println(x-y);	
//		}
//	};
//	obj.substract(10, 5);
	A obj;
	obj=(x,y) -> System.out.println(x-y);
	obj.substract(10, 5);
}

}
