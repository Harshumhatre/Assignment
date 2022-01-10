package Practice;

public class Join1 extends Thread{
public void run()
{
try {
	for (int i = 0; i < 5; i++) {	
	sleep(1000);
	System.out.println(i);
	}
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}	
}
public static void main(String[] args) throws InterruptedException {
	Join1 join1 = new Join1();
	join1.start();
	join1.join();
	try {
		for (int i = 5; i < 10; i++) {
			sleep(1000);
			System.out.println(i);
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
