package LambdaExpression;

public class B {
public static void main(String[] args) {
	
//		
//		@Override
//		public void substract(int x, int y) {
//			// TODO Auto-generated method stub
//			System.out.println(x+y);
//		}
//		
//		@Override
//		public void add(int x, int y) {
//			// TODO Auto-generated method stub
//			System.out.println(x-y);
//		}
//		
//	};
	
	//a.substract(20, 10);
//	A obj;
//	obj=(x,y)->System.out.println(x+y);
//	obj.add(10, 25);
	A a = new A() {
		
		@Override
		public void add(int x, int y) {
			// TODO Auto-generated method stub
			System.out.println(x+y);
		}
	};
	a.add(10, 15);
}
}
