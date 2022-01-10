package com.te.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
// this method used for short coding ie.stream which is used to campare the object referance of the variable. 
public class Myclass {
	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee(1, "vivek", 20000.0, "devloper", 40),
				new Employee(2, "Rahul", 30000.0, "System engineer", 42), new Employee(3, "Adwait", 40000.0, "design", 50),
				new Employee(4, "sidhhu", 50000.0, "tester", 43), new Employee(1, "mahadev", 10000.0, "devloper", 42));
		asList.stream().min(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
		asList.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		asList.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
		asList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		System.out.println("=========================================================");
		List<Employee> collect = asList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println("=============================================================");
		List<Employee> collect1 = asList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		collect1.forEach(System.out::println);
		List<Employee> collect2 = asList.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
		collect2.forEach(System.out::println);
		System.out.println("==111111111111111111111111111111111111111111111111111111111111111");
		asList.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("==================================================================");
		Map<String, List<Employee>> collect3 = asList.stream().collect(Collectors.groupingBy(Employee::getDesignation));
//		collect3.forEach(department,emp)->
//		{
//			System.out.println(department);
//			emp.forEach
//		};
		
		System.out.println("===============================================================");
		System.out.println("age above 40");
		asList.stream().filter(em->em.getAge()>40).collect(Collectors.toList()).forEach(System.out::println);
		asList.stream().filter(em->em.getAge()>45).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("=================================================================");
		System.out.println("Maximum salary collect");
		asList.stream().filter(em->em.getSalary()>30000).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("====================================================================");
		System.out.println("the all employess age are above avrage or not if yes then true or false");
		boolean anyMatch = asList.stream().anyMatch(em->em.getAge()>40);
		System.out.println(anyMatch);
		asList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList()).forEach(System.out::println);
		asList.stream().filter(em->em.getAge()>50).collect(Collectors.toList()).forEach(System.out::println);
		asList.stream().min(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
	}

}
