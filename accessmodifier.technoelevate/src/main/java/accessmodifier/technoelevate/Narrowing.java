package accessmodifier.technoelevate;

public class Narrowing {
public static void main(String[] args) {
	int a=10;
	byte b=(byte)a;
	System.out.println(b);
			if (true)
			{
				System.out.println("not done");
				System.out.println("ok fine then");
			}
			// we cannot write here S.O.P. (because if we write that then COMPILER cannot compile this.
			// it cotain an error ( an else without IF)
			else 
				System.out.println("wow");
			System.out.println("what about you ");
			System.out.println("what is your name");
		}
}
