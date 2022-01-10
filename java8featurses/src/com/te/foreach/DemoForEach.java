package com.te.foreach;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {
public static void main(String[] args) {
	List<Integer> asList = Arrays.asList(7,8,9,1,2,4);
	for (int i = 0; i < asList.size(); i++) {
		System.out.println(asList.get(i));
	}
	System.out.println("=====================");
	for (Integer integer : asList) {
		System.out.println(integer);
	}
	System.out.println("========================");
	asList.forEach(i -> System.out.print(i));
	asList.forEach(i-> System.out.println(i));
}
}
