package com.te.stop;

import java.util.Comparator;

public class Salary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.salary-o2.salary);
	}

}
