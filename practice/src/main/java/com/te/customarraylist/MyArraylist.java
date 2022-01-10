package com.te.customarraylist;

import java.util.Iterator;

public class MyArraylist {
	int position;
	Object[] array;

	public MyArraylist(int size) {
		array = new Object[size];
	}

	public void add(Object obj) {
		if (position <= array.length) {
			incresedCapacity();
		}
		array[position]=obj;
		position++;
	}
	public void incresedCapacity()
	{
		Object[]temp=new Object[array.length+3];
		for (int i = 0; i < position; i++) {
			temp[i]=array[i];
		}
		array=temp;
	}
	public void remove(int index)
	{
	for (int i = index; i < position; i++) {
		array[i]=array[i+1];
	}
	position--;
	}
	public String toString() {
		String s="["+array[0];
		for (int i = 1; i < position; i++) {
			s+=","+array[i];
		}
		s+="]";
		return s;
	}
	public Iterator iterator() {
		return new MyItr();
	}
	
	public class MyItr implements Iterator{
		int index;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			
			return (index<position)?true:false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return array[index++];
		}
	}
}
