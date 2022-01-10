package com.te.c1;

import java.util.Iterator;

public class MyArrayList {
	int position;
	Object[] array;

	public MyArrayList(int size) {
		array = new Object[size];
	}

	public void add(Object obj) {
		if (position <= array.length) {
			incresedCapacity();
		}
	}

	public void increasedCapacity() {
		Object[]temp=new Object[array.length+3];
		for (int i = 0; i < position; i++) {
			temp[i]=array[i];
		}
		array=temp;
	}
	public void remove(int index)
	{
		for (int i = 0; i < position; i++) {
			array[i]=array[i+1];
		}
	}
	@Override
	public String toString()
	{
		String s="["+array[0];
		for (int i = 1; i < position; i++) {
			s+=","+array[i];
		}
		s+="]";
		return s;
	}
}