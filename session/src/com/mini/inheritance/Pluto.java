package com.mini.inheritance;

public class Pluto {
		public static void main(String[] args) {
			Earth obj=new Earth();
			obj.life();
			obj.consist();
			obj.contains();
			Universe obj1=new Universe();
			obj1.contains();
			System.out.println("------------------");
			Universe obj2=new Earth();
			obj2.contains();
			Galaxy obj3=new Earth();
			obj3.contains();
			obj3.structure();
			System.out.println("--------------------");
			Universe obj4=new Earth();
			Universe obj5=(Universe)obj4;
			obj5.contains();
			Galaxy obj6=(Galaxy)obj5;
			obj6.contains();
			SolarSystem obj7=(SolarSystem)obj6;
			obj7.consist();
			obj7.consist();
		}
}
