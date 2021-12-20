
public class Driver {
void functions(Carfunction car)
{
car.accelerate();
car.start();
car.stop();
}
public static void main(String[] args) {
	Driver d=new Driver();
	Audi a=new Audi();
	RollsRoyce r=new RollsRoyce();
	d.functions(a);
	System.out.println("----------------");
	d.functions(r);
}
}
