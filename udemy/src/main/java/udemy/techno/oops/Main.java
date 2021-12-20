package udemy.techno.oops;

public class Main {
public static void main(String[] args) {
	Programmer p = new Programmer();
	System.out.println(p.id);
	System.out.println(p.salary);
	System.out.println(p.name);
	p.id=2;
	p.name="Harsh";
	p.salary=2000;
	System.out.println("Updated values");
	System.out.println(p.id);
	System.out.println(p.salary);
	System.out.println(p.name);
}
}
