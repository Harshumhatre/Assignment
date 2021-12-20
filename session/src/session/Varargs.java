package session;

public class Varargs {
	public static  int add(int...a) // varargs method
	{
		int res=res+a[i];
	return res;	
	}
	public static void main(String[] args) {
		int sum=add(1,2,3,4,5);
		System.out.println(sum);
	}
}
