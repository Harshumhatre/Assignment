package Practice;

public class InterputedMethod extends Thread {
	public void run() {
		Thread.interrupted();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().isInterrupted());
				sleep(1000);
				System.out.println("Main -1");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		InterputedMethod i = new InterputedMethod();
		i.start();
		i.interrupt();
	}
}
