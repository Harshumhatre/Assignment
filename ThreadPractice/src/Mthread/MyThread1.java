package Mthread;

public class MyThread1 extends Thread{
BookTickets b;
int seat;
public MyThread1(BookTickets b, int seat) {
	super();
	this.b = b;
	this.seat = seat;
}
public void run()
{
b.booktickets(seat);	
}

}
