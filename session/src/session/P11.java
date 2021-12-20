package session;

public class P11 {
	public static void main(String[] args) {
		int x=4;
		int y=6;
		System.out.println(x<<3);  // shift operator
		System.out.println(x>>3);
		System.out.println(++x>=y|(++x<=y));
		System.out.println(x);
		System.out.println(y);
		System.out.println(4|10);
		if(x>=6|y<=6)
		{
			System.out.println(x);
			System.out.println(y);
		}
		else
		{
			System.out.println("hi");
		}
	}

}
