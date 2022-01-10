package com.te.factoryDesign;

public class Driver {
Company company;
public void driver (String s)
{
if (s.equalsIgnoreCase("Nike")) {
	company=new Nike();
	company.Tshirt();
	company.jeans();
	company.shoes();
}
if (s.equalsIgnoreCase("Puma")) {
	company=new Nike();
	company.Tshirt();
	company.jeans();
	company.shoes();
}
if (s.equalsIgnoreCase("Adidas")) {
	company=new Nike();
	company.Tshirt();
	company.jeans();
	company.shoes();
}
}
}
