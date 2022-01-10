
public class TestDeadLockExample {
	public static void main(String[] args) {
		String s1 = "Harshad";
		String s2 = "rahul";
		Thread thread1 = new Thread() {
		public void run()
		{
			synchronized (s1) {
			System.out.println("Thread1:locked resource1");	
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (s2) {
			System.out.println("Thread1:locked resource2");	
			}
		}
	};
		Thread thread2 = new Thread() {
		public void run()
		{
			synchronized (s2) {
			System.out.println("Thread2:locked resource2");	
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (s1) {
			System.out.println("Thread2:locked resource1");	
			}
		}
		};
		thread1.start();
		thread2.start();
		
	}
	
}