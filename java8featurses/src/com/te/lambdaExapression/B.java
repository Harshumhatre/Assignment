package com.te.lambdaExapression;

public class B {
public static void main(String[] args) {
	A obj=new A() {
		
		@Override
		public void add(int i, int j) {
			// TODO Auto-generated method stub
		System.out.println(i+j);	
		}
	};
	obj.add(7, 8);
}
}
