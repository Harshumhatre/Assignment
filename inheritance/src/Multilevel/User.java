package Multilevel;

public class User {
	public static void main(String[] args) {
		MessageRead obj=new MessageRead();
		obj.text();
		obj.textrecived();
		obj.msgread();
		System.out.println("------------");
		MessageRecived obj1=new MessageRecived();
		obj1.text();
		obj1.textrecived();
	}

}
