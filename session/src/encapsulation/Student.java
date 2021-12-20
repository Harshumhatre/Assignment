package encapsulation;

public class Student {
String stdname;
String stdid;
private double percentage;
public void set(String stdname, String stdid, double percentage) {
	this.stdname = stdname;
	this.stdid = stdid;
	this.percentage = percentage;
}
public void get() {
	System.out.println(stdname);
	System.out.println(stdid);
	System.out.println(percentage);
}
}
