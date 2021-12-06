import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter how many numbers you want to give");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("enter the number");
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.println(a[i]);	
}

	}
}
