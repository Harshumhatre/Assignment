package com.te.designpattern;

public class Whatapp {
	private static Whatapp whatapp;  // we will make it ata final so we can resritcts its from user.

	private Whatapp() {
	}
	static Whatapp methods1()
	{
		if (whatapp==null) {
			 whatapp = new Whatapp();
			return  whatapp;
		}
		return whatapp;
	}

}
