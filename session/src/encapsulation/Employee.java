package encapsulation;

public class Employee {
	private String empid;
	private int age;
	private String name;
	private static String designation;
	public void set(String empid,int age,String name,String designation)
	{
		this.empid=empid;
		this.age=age;
		this.name=name;
		this.designation=designation;
		
	}
	public void get()
	{
		System.out.println("EmpId"+empid);
		System.out.println("Age of Employeer"+age);
		System.out.println("Name of Employeer"+name);
		System.out.println("Designation"+designation);
	}

}
