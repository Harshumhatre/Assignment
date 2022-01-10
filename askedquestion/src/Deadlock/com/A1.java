package Deadlock.com;

public class A1 {
public static void main(String[] args) {
	final String resources1="Harshad";
	final String resources2="Vivek";
	Thread thread = new Thread() {
		public void run()
		{
			synchronized (resources1) {
				System.out.println("Thread1- Resource1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (resources2) {
					System.out.println("Thread1- Resource2");
				}
				}
		}
	
	};
	Thread thread2 = new Thread() {
	public void run() {
	synchronized (resources2) {
		System.out.println("Thread2-Resource2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (resources1) {
			System.out.println("Thread2-Resource1");
		}
	}
	}
};

}
}