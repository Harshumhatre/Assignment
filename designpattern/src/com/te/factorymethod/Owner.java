package com.te.factorymethod;

import java.util.Scanner;

public class Owner {
public static void main(String[] args) {
	Driver driver = new Driver();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Vivek boss.... gadav..Enter your car");
	String s=scanner.next();
	driver.driver(s);
}
}
