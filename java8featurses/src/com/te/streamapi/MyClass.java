package com.te.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.te.maximumorminimum.Employee;

public class MyClass {
public static void main(String[] args) {
	List<Employee> asList = Arrays.asList(new Employee(1,"harshad", "software devloper", 26,20000),
			 								new Employee(2,"Adwait", "tester", 23,300000),
			 								new Employee(3,"vivek", "software devloper", 24,400000));
	//asList.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
	//asList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
	List<Employee> collect = asList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
	collect.forEach(System.out::println);
	System.out.println("=====================");
	List<Employee> collect2=asList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
	collect2.forEach(System.out::println);
	List<Employee> collect3 = asList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
asList.stream().filter(em ->em.getAge()>20).collect(Collectors.toList()).forEach(System.out.println());
}
}
