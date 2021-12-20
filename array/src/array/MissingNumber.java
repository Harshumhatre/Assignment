package array;

import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the array");
	int length=sc.nextInt();
	int a[]=new int[length];
	System.out.println("entr the element");
	for (int i = 0; i < length; i++) {
		a[i]=sc.nextInt();
	}
	int res=a[0];
	for (int i = 1; i < a.length; i++) {
		res=res^a[i];
	}
	int res1=1;
	for (int i = 2; i < a.length+1; i++) {
		res1=res1^a[i];
	}
	System.out.println(res1);
	}
	
}
