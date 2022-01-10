package com.te.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class A1 {
public static  void main(String[] args) {
	HashMap<Long,String> hashMap = new HashMap<Long, String>();
	hashMap.put(9921973960L, "Papa");
	hashMap.put(9604138667L, "Aai");
	hashMap.put(9410150638L, "Tai");
	hashMap.put(7038986304L, "Harshad");
//	System.out.println(hashMap);
	Iterator<Entry<Long, String>> iterator = hashMap.entrySet().iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Phonenumber");
	long key=scanner.nextLong();
	System.out.println(hashMap.get(key));
}
}
