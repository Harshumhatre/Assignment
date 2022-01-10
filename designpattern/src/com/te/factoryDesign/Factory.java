package com.te.factoryDesign;

import java.util.Scanner;

public class Factory {
public static void main(String[] args) {
	Driver driver = new Driver();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your brand");
	String s=scanner.next();
	driver.driver(s);
	
}
}
