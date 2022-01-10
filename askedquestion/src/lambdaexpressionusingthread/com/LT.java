package lambdaexpressionusingthread.com;

public class LT {
public static void main(String[] args) {
	Runnable r=()->{
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	Thread thread = new Thread(r);
	thread.start();
	Runnable r1=()->{
		for (int i = 5; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	Thread thread2 = new Thread(r1);
	thread2.start();
}
}
