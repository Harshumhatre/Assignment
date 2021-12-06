package assignment;
import java.util.Scanner;
public class A1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a=obj.nextDouble();
		System.out.println("Enter the value of b");
		double b=obj.nextDouble();
		System.out.println("Enter the value of c");
		double c=obj.nextDouble();
		double d=b*b-4*a*c;
		double x1,x2;
		if (d>0.0) {
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The two roots are "+x1+"and"+x2);
		}
		else if (d==0) {
			x1=-b/(2*a);
			System.out.println("the root is "+x1);
		}
		else
		{
			System.out.println("the roots are not real");
		}
			
		}
	}
