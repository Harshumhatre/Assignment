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
	 Set<Integer> keySet = hashMap.keySet();
//	 for (Integer i : keySet) {
//		System.out.println(i+hashMap.get(i));
//	}
//	 hashMap.forEach(i -> System.out.println(i)); we not used forrach loop in hashmap
//	 System.out.println(hashMap.get(1));
//	 System.out.println(hashMap.get(2));
//	 System.out.println(hashMap.get(3));
//	 System.out.println(hashMap.get(4));
//	 Set<Integer> keySet = hashMap.keySet();
//	 for (Integer integer : keySet) {
//		System.out.println(integer);
//	}
//	Set<Integer> keySet = hashMap.keySet();
//	for(Integer i:keySet)
//	{
//		System.out.println("keys"+i+", Values"+hashMap.get(i));
//	}
	
}
}
