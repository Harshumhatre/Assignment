package com.te.arraylistshort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Myclass {
	public static void main(String[] args) {
List<Integer> arrList=Arrays.asList(1,2,3,4,5,6,7,8,9);
//arrList.forEach(System.out::println);
arrList.forEach(i -> System.out.println(i));
Collections.reverse(arrList);
System.out.println(arrList);
	}
}
