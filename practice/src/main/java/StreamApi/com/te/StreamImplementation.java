package StreamApi.com.te;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class StreamImplementation {
public static void main(String[] args) {
	List<Employee> asList = Arrays.asList(new Employee(1, "Harshad", 20000, 25),
			new Employee(3, "Rahul", 30000, 23),
			new Employee(4, "Manjunath", 40000, 24),
			new Employee(2, "Rahul", 10000, 22),
			new Employee(5, "siddhu", 45000, 26));
	asList.stream().min(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
	asList.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
	System.out.println("================================================");
	asList.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList()).forEach(System.out::println);
	System.out.println(asList);
//	System.out.println("-----------------------------------------");
//	System.out.println("8888888888888888888888888888888888");
//	ListIterator<Employee> listIterator = asList.listIterator();
//	while (listIterator.hasPrevious()) {
//		System.out.println(listIterator.previous());
//	}
//	System.out.println("------------------------------------------------");
//	asList.stream().filter(em -> em.getAge()>20).collect(Collectors.toList()).forEach(System.out::println);
}
}
