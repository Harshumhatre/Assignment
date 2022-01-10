package StreamApi.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass {
public static void main(String[] args) {
	List<Employee> asList = Arrays.asList(new Employee(1, "Harshad", 1000),
		        	new Employee(2, "Vivek", 2000),
		        	new Employee(3, "rahul", 3000));
	asList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
	asList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList()).forEach(System.out::println);
	asList.stream().filter(em->em.getSalary()>=2000).collect(Collectors.toList()).forEach(System.out::println);
}
}
