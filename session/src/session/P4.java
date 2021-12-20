package session;
import java.util.Scanner;
public class P3 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first no");
		int a=obj.nextInt();
		int a1=obj.nextInt();
		int result;
		int sum=0;
		for(int i=a1;i>=1;i--)
		{
			result=a*i;
			System.out.println(a+"*"+i+"="+result);
			sum=sum+result;
		}
		System.out.println("Total sum="+sum);
	}

}
