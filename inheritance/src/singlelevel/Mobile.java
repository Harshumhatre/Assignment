package singlelevel;

public class Mobile {
	public static void main(String[] args) {
	Phone obj=new Phone();
	obj.cost=120000;
	obj.colour="gray onion";
	obj.sim=2;
	obj.brand="one plus  nord";
	System.out.println(obj.colour);
	System.out.println(obj.cost);
	System.out.println(obj.sim);
	System.out.println(obj.brand);
	obj.call();
	obj.text();
	
	SmartPhone obj1=new SmartPhone();
	obj1.cost=1200000;
	obj1.brand="Samsung";
	obj1.colour="black";
	obj.sim=2;
	System.out.println(obj1.cost);
	System.out.println(obj1.colour);
	System.out.println(obj1.cost);
	System.out.println(obj1.sim);
	System.out.println(obj1.brand);
	obj1.playpubg();
	obj1.surfing();
	}
}
