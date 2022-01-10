package com.tech.list;

public class CustmArraylist {
	int position;
	Object[]array;
	public CustmArraylist(int size) {
	 array = new Object[size];
	}
	public void add(Object obj)
	{
		if (position>=array.length) {
			increaseCapacity();
		}
		array[position]=obj;
		position++;
	}
	public void increaseCapacity()
	{
		Object []temp = new Object[array.length+3];
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
