package com.te.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class M2 {
public static void main(String[] args) {
	List<Employee1> asList = Arrays.asList(new Employee1(1,"harshu", 2000),new Employee1(2, "manju", 22202),new Employee1(3, "sidhhu", 226260));
	asList.stream().min(Comparator.comparing(Employee1::getSalary)).ifPresent(System.out::println);	
	asList.stream().sorted(Comparator.comparing(Employee1::getSalary)).collect(Collectors.toList()).forEach(System.out::println);
	asList.stream().filter(em->em.getSalary()>2000).collect(Collectors.toList()).forEach(System.out::println);
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("=========================================================");
	
	
	asList.stream().min(Comparator.comparing(Employee1::getSalary)).ifPresent(System.out::println);










System.out.println("================================");




asList.stream().sorted(Comparator.comparing(Employee1::getName)).collect(Collectors.toList()).forEach(System.out::println);










p



System.out.println("==================================");

asList.stream().filter(em->em.getSalary()>1000).collect(Collectors.toList()).forEach(System.out::println);

}

}
