package assignment3;

public class Varags {
	public static void input(int...a)
	{
		System.out.println("Address of a=> "+a);
		for(int x:a)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		System.out.println("main Begins...");
		System.out.println();
		Varags.input(1,2,3,4,5,6,7,8,9,10);
		System.out.println();
		System.out.println("Main End");
	}

}
