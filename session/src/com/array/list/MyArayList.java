package com.array.list;

import java.util.Arrays;
import java.util.Iterator;

public class MyArayList {
	Object[] array;
	int position;

	public MyArayList(int size) {
		array = new Object[size];
	}

	public void add(Object obj) {
		if (position >= array.length) {
			increaseCapacity();
		}
		array[position] = obj;
		position++;
	}

	private void increaseCapacity() {
		Object[] temp = new Object[array.length + 3];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	public Object get(int index) {
		return array[index];
	}

	public void remove(int index) {
		for (int i = index; i < position; i++) {
			array[i] = array[i + 1];
		}
		position--;
	}
	public Iterator iterator() {
		return new MyItr();
	}

	@Override
	public String toString() {
		String s = "[" + array[0];
		for (int i = 1; i < position; i++) {
			s += "," + array[i];
		}
		s += "]";
		return s;
	}
	
	private class MyItr implements Iterator{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	

}
