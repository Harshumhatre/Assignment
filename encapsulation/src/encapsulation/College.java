package encapsulation;

public class College {
	public static void main(String[] args) {
		Student obj=new Student("Harshad","Mechanical","ME21",83.80);
		System.out.println(obj.name);
		System.out.println(obj.branch);
		System.out.println(obj.id);
		System.out.println(obj.getpercent());
		System.out.println(obj.getpercent());
		obj.setpercent(90.12);
		System.out.println(obj.getpercent());
	}

}
