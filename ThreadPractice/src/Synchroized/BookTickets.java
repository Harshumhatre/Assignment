package Synchroized;

public class BookTickets extends Thread {
	static Seats s;
	int seat;
public void run()
{
s.seatsbook(seat);
}
public static void main(String[] args) {
 s = new Seats();
 BookTickets b = new BookTickets();
b.start();
b.seat=2;
BookTickets b1 = new BookTickets();
b1.start();
b1.seat=3;
}
}
