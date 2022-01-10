package com.te.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapE1 {
public static void main(String[] args) {
	HashMap<Long,String> hashMap = new HashMap<Long, String>();
	hashMap.put(9921973960l,"papa");
	hashMap.put(96041388667l,"aai");
	hashMap.put(9021561175l,"sister");
	hashMap.put(7410150638l,"me");
	System.out.println(hashMap.keySet());
	System.out.println(hashMap.values());
	Set<Entry<Long,String>> entrySet = hashMap.entrySet();
	System.out.println(entrySet);
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the mobile number");
	long key=scanner.nextLong();
	System.out.println(hashMap.get(key));
}
}
