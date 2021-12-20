package string;

public class stringMethods {
	public static void main(String[] args) {
	String s="my name is harshad";
	 String name=s.toUpperCase();
	 System.out.println("name");
	 String []a=name.split(" ",4);
	 for(String x:a)
	 {
		 System.out.println(x);
	 }
	 String b=new String("harshad");
	 String d=new String("harshad");
	 System.out.println(b.equals(d));
	 System.out.println(b==d);
	 
	}
}
