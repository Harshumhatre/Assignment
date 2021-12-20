package session33;

public class Owner {
public static void main(String[] args) {
	Driver d=new Driver();
	d.drive(new RollsRoyce());
	System.out.println("----------------");
	d.drive(new Audi());
	Driver obj=new Driver();
	obj.drive(new RollsRoyce());
}
}
