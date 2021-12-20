package encapsulation;

public class Admin {
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.set("wp13",24,"Harsh","Software Engineer");
		Employee obj1=new Employee();
		obj1.set("wp14", 24, "rahul", "Software Engineer");
		obj.get();
		System.out.println("-----------------------");
		obj1.get();
		
		
		
	}

}
