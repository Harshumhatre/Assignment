package com.te.customArraylist1;

import java.util.Iterator;

public class MyaarayList {
int position;
Object[]array;
public  MyaarayList(int size)
{
array=new Object[size];	
}
public void add(Object obj)
{
if (position>=array.length) {
	incresedcapacity();
}
array[position]=obj;
position++;
}
public void incresedcapacity()
{
	Object[]temp=new Object[array.length+3];
	for (int i = 0; i < array.length; i++) {
		temp[i]=array[i];
	}
	array=temp;
}
public void remove(int index)
{
for (int i = index; i < position; i++) {
	array[i] = array[i+1];
}
position--;
}
public String toString()
{
String s="["+array[0];
for (int i = 1; i < position; i++) {
	s+=","+array[i];
}
s+="]";
return s;
}
public Iterator iterator()
{
return new MyItr();	
}
class MyItr implements Iterator
{
int index;
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return (index<=position)?true:false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return (index++);
	}
	
}
}
