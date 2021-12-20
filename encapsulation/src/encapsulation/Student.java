.package encapsulation;

public class Student {
	 String name;
	 String branch;
	 int id;
private	 double percent;
	 Student(String name,String branch,String id,double percent)
	 {
		this.name=name;
		this.branch=branch;
		this.id=id;
		this.percent=percent;
	 }
	 public double getpercent()
	 {
		 return percent;
	 }
	 public void  setpercent (double percent)
	 {
		 this.percent=percent;
	 }

}
