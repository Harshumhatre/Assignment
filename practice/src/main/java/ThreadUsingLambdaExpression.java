
public class ThreadUsingLambdaExpression {
	public static void main(String[] args) throws InterruptedException {
		Runnable r = () -> {
			for (int i = 0; i < 30; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		};
		Thread thread = new Thread(r);
		thread.start();
		Runnable r1 = () -> {
			for (int i = 11; i < 20; i++) {
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		};
		Thread thread2 = new Thread(r1);
		thread2.start();
	}
}
