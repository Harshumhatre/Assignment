package com.te.lambdaExapression1;

public class D {
public static void main(String[] args) {
	C obj=new C() {
		
		@Override
		public void multiply(int x, int y) {
			// TODO Auto-generated method stub
		System.out.println(x*y);	
		}
	};
	obj.multiply(9, 8);
	
	System.out.println("==================");
	obj=(x,y) -> System.out.println(x*y);
	obj.multiply(7, 5);
}
}
