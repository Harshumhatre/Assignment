package session;
import java.util.Scanner;
public class P6 {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the first value");
	int a=obj.nextInt();
	System.out.println("Enter the second value");
	int b=obj.nextInt();
	System.out.println("Enter how many numbers you want to print");
	int n=obj.nextInt();
	double sum;
	double res1=0;
	sum=(a+(Math.pow(2, 0)*b));
	for(int i=1;i<n;i++)
	{
	sum=sum+(Math.pow(2,i)*b);
	System.out.println(sum);
	}
	
	
	
}
}
