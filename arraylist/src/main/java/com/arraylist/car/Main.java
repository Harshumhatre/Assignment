package com.arraylist.car;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
public static void main(String[] args) {
	Car c1=new Car("Bmw", "Series1",2000000);
	Car c2=new Car("Bmw", "Series2",3000000);
	Car c3=new Car("Bmw", "Series3",4000000);
	ArrayList<Car> a1 = new ArrayList<Car>();
	a1.add(c1);
	a1.add(c2);
	a1.add(c3);
	ListIterator<Car> listIterator = a1.listIterator();
	while (listIterator.hasNext()) {
		System.out.println(listIterator.next());
	}

}
}
