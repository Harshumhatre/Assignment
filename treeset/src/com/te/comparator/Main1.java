package com.te.comparator;

import java.util.Comparator;

public class Main1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
//		String i1 =(String) o1;
//		String i2 =(String) o2;
//		return -i1.compareTo(i2);
		String s1=o1.toString();
		String s2=o2.toString();
		return -s1.compareTo(s2);
	}

}
