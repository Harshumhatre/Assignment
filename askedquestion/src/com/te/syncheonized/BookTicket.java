package com.te.syncheonized;

public class BookTicket {
int total=20;
synchronized void bookticket(int seat)
{
if (total>=seat) {
System.out.println("Thank you ....your seat confirmed suceesfully");
total=total-seat;
System.out.println("Seats remaning are"+total);
}
else {
	System.out.println("Sorry seat are not avilable");
}
}
}
