package col1;

//sort using the name....
import java.util.ArrayList;
import java.util.Collections;

public class Company {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList();
		Employee employee = new Employee(2, " harsh", 10000);
		arrayList.add(new Employee(6, "hari", 3000
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				..args));
		arrayList.add(new Employee(4, "harshad", 30000));
		arrayList.add(new Employee(1, "harshada", 300000));
// 	arrayList.add(employee);
		// arrayList.add(employee);
		// arrayList.add(2,employee);
		// arrayList.add(4,new Employee(4,"Messi",10000));
//	for(Employee e:arrayList)
//	{
//		System.out.println(e);
//	}
//	System.out.println("=====================");
//	Collections.sort(arrayList);
//		for (Employee e : arrayList) {
//			System.out.println(e);
//		}
		Collections.sort(arrayList, new SortBySalary());
		for (Employee e : arrayList) {
			System.out.println(e);
		}
	}
}
