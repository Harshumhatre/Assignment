package com.te.synchronized1;

public class BookTheterSeat {
	int totalseats=10;
synchronized void bookseat(int seat)
{
if (totalseats>=seat) {
	System.out.println(seat+"Seats book succesfully");
	totalseats=totalseats-seat;
	System.out.println("Seats left = "+ totalseats);
} else {
	System.out.println("Seats are not avilable");
}	
}
}
