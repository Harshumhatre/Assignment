package session;
import java.util.Scanner;
public class P3 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first no");
		int a=obj.nextInt();
		System.out.println("how times ypu want a table");
		int a1=obj.nextInt();
		int result;
		int sum=0;
		System.out.println("mentioned your range");
		int range=obj.nextInt();
		for(int i=1;i<=a1;i++)
		{
			 	result=a*i;
			
			System.out.println(a+"*"+i+"="+result);
			
			sum=sum+result;
			if (range<=sum) {
				System.out.println(sum);
				break;
			}
		}
		System.out.println(sum);
		 
			
			
		
	}

}
