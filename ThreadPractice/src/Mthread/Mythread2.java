package Mthread;

public class Mythread2 extends Thread {
int seat;
BookTickets b;
public Mythread2(int seat, BookTickets b) {
	super();
	this.seat = seat;
	this.b = b;
}
public void run()
{
b.booktickets(seat);	
}
}
