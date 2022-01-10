package com.te.HashMap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
public static void main(String[] args) {
	HashMap<String,Long> hashMap = new HashMap<String, Long>();
	hashMap.put("Papa",9921973960l);
	hashMap.put("Mummy",9604138667l);
	hashMap.put("Tai", 9410150638l);
	hashMap.put("dev", 3627718189l);
	Set<Entry<String,Long>> entrySet = hashMap.entrySet();
//	Set<Entry<String,Long>> entrySet = hashMap.entrySet();
//	System.out.println(entrySet);
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Enter the name");
//	String value=scanner.next();
//	System.out.println(hashMap.get(value));
	for (Entry<String, Long> entry : entrySet) {
		System.out.println(entry);
	}
	System.out.println("==============================");
	entrySet.forEach(i->System.out.println(i));
	System.out.println("===============1=============");
	Iterator<Entry<String, Long>> iterator = entrySet.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	entrySet.contains(iterator);
	System.out.println(entrySet.contains(iterator));
	boolean containsAll = entrySet.containsAll(entrySet);
	System.out.println(containsAll);
}
}
