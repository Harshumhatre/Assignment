package col1;

	public class Salary implements Comparable<Salary>  {
		int empid;
		String name;
		double salary;
		public Salary(int empid,String name,double salary)
		{
		super();
		if(empid>0)
		{
		this.empid=empid;
		}
		this.name=name;
		this.salary=salary;
		}
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
		}
		public int compareTo(Salary o)
		{
			return this.empid-o.empid;
		}
		
		
		
	}


}
