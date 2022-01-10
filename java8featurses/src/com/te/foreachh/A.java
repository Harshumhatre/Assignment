package com.te.foreachh;

import java.util.Arrays;
import java.util.List;

public class A {
public static void main(String[] args) {
	List<String> asList = Arrays.asList("vivek","rahul","manju","siddhu");
	asList.forEach(em -> System.out.println(em));
}
}
