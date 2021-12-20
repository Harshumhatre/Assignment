package Exception;

public class Throws {
	public void harshad()
	{
		System.out.println("I did not do it");
		throw new ArrayIndexOutOfBoundsException();
	}
public static void main(String[] args) {
	System.out.println("Who has done it?");
	Throws td=new Throws();
	td.harshad();
}
}
