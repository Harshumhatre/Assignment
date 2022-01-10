package Com.te.wait;

public class Salary {
public static void main(String[] args) throws InterruptedException {
	TotalEarning totalEarning = new TotalEarning();
	totalEarning.start();
	synchronized (totalEarning) {
	totalEarning.wait();
	System.out.println(totalEarning.total);
	}
}
}
