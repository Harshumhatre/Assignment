package com.technoelevate.string;

public class Demo {
public static void main(String[] args) {
	Employee obj=new Employee("har@1234","harshad552@gmail.com",9921);
	System.out.println("username= "+obj.getusername());
	obj.setusername("Hi");
	System.out.println(obj.getusername());
	obj.setpassword(132435);
	System.out.println(obj.getpassword());
	System.out.println("emailid= "+obj.getemailid());
	obj.setemailid("harshad@1234");
	System.out.println(obj.getemailid());
	System.out.println("password= "+obj.getpassword());
	
	
}
}
