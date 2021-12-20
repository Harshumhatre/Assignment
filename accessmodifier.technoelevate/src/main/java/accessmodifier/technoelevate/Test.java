package accessmodifier.technoelevate;

public class Test extends Modifier {
	public static void main(String[] args) {
		Modifier obj=new Modifier();
		obj.m1();
		obj.m2();
		obj.m3();
		Test obj1=new Test();
		//private method acan't access in another class ..it access only the same class.
		//obj.m4();  	
	}

}
