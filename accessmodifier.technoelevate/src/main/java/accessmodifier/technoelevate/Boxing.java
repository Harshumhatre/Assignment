package accessmodifier.technoelevate;

public class Boxing {
public static void main(String[] args) {
	int n=50;  //final
	Integer m=Integer.valueOf(n);
	System.out.println(n);
	System.out.println(m);
	int a=20;
	Integer b=a;
	System.out.println(a);
	System.out.println(b);
	int a1=10;
	String s1=String.valueOf(a1);
	System.out.println(a1);
	System.out.println(s1);
	boolean a2=false;
	String s2=String.valueOf(a2);
	System.out.println(a2);
	System.out.println(s2);
}
}
