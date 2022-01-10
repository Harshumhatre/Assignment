package com.te.comparedTo;

import java.util.Comparator;

public class Salary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.salary-o2.salary;
		
	}

}
