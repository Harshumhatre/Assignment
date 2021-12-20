package Car;

public class Owner {
public static void main(String[] args) {
	Driver driver = new Driver();
	driver.driver(new RollsRoyce());
	System.out.println("=======================");
	driver.driver(new Audi());
}
}
