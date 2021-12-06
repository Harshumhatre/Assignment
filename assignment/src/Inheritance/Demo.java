package Inheritance;

public class Demo {
	public static void main(String[] args) {
		Moon obj=new Moon();
		obj.contains();
		obj.consist();
		obj.structure();
		obj.life();
		obj.article();
		//upcasting from Universe to Moon
		Universe obj1=new Moon();
		obj1.contains();
		//upcasting from  SolarSystem to Moon
		SolarSystem obj2=new Moon();
		obj2.contains();
		obj2.consist();
		//upcasting from Galaxy to moon
		Galaxy obj3=new Moon();
		obj3.contains();
		obj3.consist();
		obj3.structure();
		//obj3.life();
	//	obj3.article();
		//upcasting from Earth to Moon
		Earth obj4=new Moon();
		obj4.contains();
		obj4.consist();
		obj4.structure();
		obj4.life();
		
	}

}
