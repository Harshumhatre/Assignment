package Mthread;

public class Main1 {
public static void main(String[] args) {
	BookTickets bookTickets = new BookTickets();
	MyThread1 myThread1 = new MyThread1(bookTickets, 10);
	myThread1.start();
	Mythread2 mythread2 = new Mythread2(8, bookTickets);
	mythread2.start();
	
}
}
