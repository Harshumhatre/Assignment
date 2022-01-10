
public class SetDeamon1 extends Thread{
public void run()
{
for (int i = 0; i < 10; i++) {
	System.out.println(Thread.currentThread().getName());
}	
}
public static void main(String[] args) {
	SetDeamon1 s = new SetDeamon1();
	System.out.println(Thread.currentThread().getName());
	s.setDaemon(true);
	s.start();
}

}
