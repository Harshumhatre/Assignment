package col1;

//sort using the name....
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList();
		arrayList.add(new Employee(7, "Harshu", 50000));
		arrayList.add(new Employee(9, "Rahul", 40000));
		arrayList.add(new Employee(2, "Shubham", 20000));
		arrayList.add(new Employee(4, "nikhil", 30000));
		Collections.sort(arrayList,new SortBySalary());
		Iterator<Employee> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
//				
//				
//				..args));
//		arrayList.add(new Employee(4, "harshad", 30000));
//		arrayList.add(new Employee(1, "harshada", 300000));
//// 	arrayList.add(employee);
//		// arrayList.add(employee);
//		// arrayList.add(2,employee);
//		// arrayList.add(4,new Employee(4,"Messi",10000));
////	for(Employee e:arrayList)
////	{
////		System.out.println(e);
////	}
////	System.out.println("=====================");
////	Collections.sort(arrayList);
////		for (Employee e : arrayList) {
////			System.out.println(e);
////		}
//		Collections.sort(arrayList, new SortBySalary());
//		for (Employee e : arrayList) {
//			System.out.println(e);
//		}
	}
}
