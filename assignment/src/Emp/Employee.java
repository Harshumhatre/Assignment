package Emp;

public class Employee {
int eid;
String ename;
double esal;
Employee()
{
}
public int getId()
{
return eid;	
}
public  String getName()
{
return ename;	
}
public void setName(String ename)
{
this.ename=ename;	
}
public  double getSal()
{
return esal;	
}
public void setSal(double esal)
{
this.esal=esal;	
}
}
