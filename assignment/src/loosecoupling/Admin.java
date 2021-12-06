package loosecoupling;

public class Admin {
	public static void main(String[] args) {
		System1 obj=new System1();
		obj.Student(new MumbaiUniversity());
		System.out.println("-----------------------");
		obj.Student(new PuneUniversity());
	}

}
