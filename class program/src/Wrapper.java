
public class Wrapper {
	public static void main(String[] args) {
		Integer n=12;
		Integer m=new Integer(15);
		Integer k=Integer.valueOf(200);
		System.out.println(k);
		System.out.println(n);
		System.out.println(m);
		int a=20;
		Integer b=new Integer(a);
		Integer b1=Integer.valueOf(30);
		System.out.println(b1);
		System.out.println(a);
		System.out.println(b);
		int a1=30;
		String s1=String.valueOf(a1);
		System.out.println(s1);
		//String s2="wow";
	//	Integer a2=Integer.valueOf(s2);
		boolean b2=true;
		String s=String.valueOf(b2);
		System.out.println(b2);
		System.out.println("----------------------------------------------------------");
		Integer i=20;
		int v=i.intValue();
		System.out.println(v);
		Double d=20.30;
		double d1=d.doubleValue();
		System.out.println(d1);
		
		
		
	}
}
