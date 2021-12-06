package com.techno.Inheritnce2;

public class Employee {
 private int id;
 private String ename;
 private double salry;
 static int count=0;
 {
	 count++;
	 System.out.println("welcome"); 
 }
 public void getid()
 {
	 System.out.println("id :"+ count);
 }
 public void getename()
 {
	 System.out.println("name :"+ count);
 }
 public void getsalary()
 {
	 System.out.println("salary :"+ count);
 }
public void setename(String ename)
{
this.ename=ename;	
}
public void setsalary(double salary)
{
this.salry=salary;	
}
@Override
public String toString() {
	return "Employee [id=" + id + ", ename=" + ename + ", salry=" + salry + "]";
}

}
