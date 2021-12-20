package Exception;

import java.nio.file.AtomicMoveNotSupportedException;

public class A3 {
	public static void m1()
	{
		try {
			System.out.println("Hello");
			m1();
			
		} catch (StackOverflowError   e) {
			// TODO: handle exception
			System.out.println("ok");
		}
	}
public static void main(String[] args) {
	m1();
}
}
