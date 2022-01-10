package com.tech.list;

import java.util.Iterator;

public class CustomArrayList {
	Object[] array;
	int position;

	public CustomArrayList(int size) {
		Object array = new Object();
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

	public void remove(int index) {
		for (int i = index; i <= position; i++) {
			array[i] = array[i + 1];
		}
		position--;
	}

	public Iterator iterator() {
		return new Itr();
	}

	class Itr implements Iterator{
		int index=0;
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
