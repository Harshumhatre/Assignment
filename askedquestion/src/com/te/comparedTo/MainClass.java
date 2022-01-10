package com.te.comparedTo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class MainClass {
public static void main(String[] args) {
List<Employee> list = Arrays.asList(new Employee(4, "Harshad", 10000),
				new Employee(5, "Rahul", 50000),
				new Employee(1, "Siddhu", 30000));

Collections.sort(list);
System.out.println(list);
}
}
