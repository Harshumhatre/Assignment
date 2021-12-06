package AssignException;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee employee2 = new Employee(1, "Rakshit", 20000);
			Employee employee3 = new Employee(2, "Aayush", 25000);
			Employee employee4 = new Employee(3, "Yash", 23000);
			Employee employee5 = new Employee(4, "Romen", 30000);
			Employee employee = new Employee(2, "Adwait", 24000);
			employee2.equals(employee3);
			employee2.equals(employee4);
			employee2.equals(employee5);
			employee2.equals(employee);
			employee3.equals(employee4);
			employee3.equals(employee5);
			//employee3.equals(employee);
			employee4.equals(employee5);
			//employee4.equals(employee);
			employee5.equals(employee);
			ArrayList<Employee> arrayList = new ArrayList<Employee>();
			arrayList.add(employee2);
			arrayList.add(employee3);
			arrayList.add(employee4);
			arrayList.add(employee5);
			arrayList.add(employee);
			Iterator<Employee> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				Employee emp = (Employee) iterator.next();
				System.out.println(emp);
			}
		}
	}