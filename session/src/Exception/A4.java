package Exception;

import java.util.Scanner;

public class A4 {
	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
		
		try {
		int	result=x/y;
		int arr[]=new int[result];
		arr[4]=50;
		System.out.println("result");
		System.out.println("End program");
		} catch (A100B e) {
			System.out.println("Exception occured");
		}
	}

}
