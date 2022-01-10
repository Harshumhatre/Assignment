package com.techno.hashset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {
public static void main(String[] args) {
	HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
	hashMap.put(1, "harshad");
	hashMap.put(2, "vivek");
	hashMap.put(4, "siddhu");
	hashMap.put(3, "vivek");
	hashMap.put(4,"rahul");
	Iterator<Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println(hashMap.keySet());
	System.out.println(hashMap.values());
}
}
