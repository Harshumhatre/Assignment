package Synchroized;

public class Seats {
int total=20;
int seat;
synchronized void seatsbook(int seat)
{
if(total>=seat)
{
total=total-seat;
System.out.println("Your ticket will be confirmed");
System.out.println("left tickets are"+total);
}
else 
{
System.out.println("sorry ...no remning tickets");	
}
}
}
