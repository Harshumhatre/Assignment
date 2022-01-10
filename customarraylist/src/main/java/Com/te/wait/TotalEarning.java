package Com.te.wait;

public class TotalEarning extends Thread{
int total=300;
public void run()
{
synchronized (this) {
	for (int i = 0; i < 30; i++) {
		total=total+100;
	}
	notify();
}	
}
}
