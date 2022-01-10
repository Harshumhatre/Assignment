package Mthread;

public class BookTickets {
int total=20;
synchronized void booktickets(int seat)
{
if (total>=seat) {
total=total-seat;
System.out.println("your tickets are confirmed..");
System.out.println("Remaning seat are"+total);
} else {
System.out.println("sorry");
}	
}
}
