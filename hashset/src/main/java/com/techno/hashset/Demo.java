package com.techno.hashset;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
public static void main(String[] args) {
	 HashMap<Integer,String> hashMap=new HashMap();
	 hashMap.put(1, "Rahul");
	 hashMap.put(2, "Harshad");
	 hashMap.put(3, "vivek");
	 hashMap.put(4, "Adwait");
//	 System.out.println(hashMap.get(1));
//	 System.out.println(hashMap.get(2));
//	 System.out.println(hashMap.get(3));
	 System.out.println(hashMap.get(4));
	Set<Integer> keySet = hashMap.keySet();
	for(Integer i:keySet)
	{
		System.out.println("keys"+i+", Values"+hashMap.get(i));
	}
	Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
	for(Entry<Integer, String> s: entrySet)
	{
	System.out.println(s);
	}
}
}
