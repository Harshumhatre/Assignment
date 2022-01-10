package com.te.ComparedTo;

import java.util.Comparator;

public class Salary implements Comparator<Employees>{

	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		return (int) (o1.salary-o2.salary);
	}

	

}
