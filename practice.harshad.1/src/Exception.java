import java.util.Scanner;
public class Exception {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=sc.nextInt();
	System.out.println("Enter the Second number");
	int b=sc.nextInt();
	try {
		int res=a/b;
		System.out.println(res);	
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Infinite value are not control");
	}
}
}
