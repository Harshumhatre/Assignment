package com.te.foreachh;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class A1 {
public static void main(String[] args) {
	List<String> asList = Arrays.asList("Harshad","Vivek","Rahul","Adwait","Siddhu");
//	asList.forEach(str -> System.out.println(str));
//	Consumer<String> consumer = new Consumer<String>() {
//		public void accept(String s)
//		{
//			System.out.println(s);
//		}
//	};
//	asList.forEach(consumer);
 	asList.forEach(Str -> System.out.println(Str));
 	Collections.reverse(asList);
 	System.out.println(asList);
}
}
