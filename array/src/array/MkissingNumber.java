package array;

import java.util.Scanner;

public class MkissingNumber {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of array");
	int length=sc.nextInt();
	int a[]=new int[length];
	for (int i = 0; i <length; i++) {
		a[i]=sc.nextInt();
	}
		int expectlength=a.length+1;
		int totalsum= (expectlength* (expectlength))/2;
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(totalsum-sum);
	}
}
