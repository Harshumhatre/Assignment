package array;

import java.util.Scanner;

public class FirstDuplicateElements {
	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of array");
int length=sc.nextInt();
System.out.println("enter the elements of an array");
int a[]=new int[length];
for (int i = 0; i < length; i++) {
	a[i]=sc.nextInt();
}
int temp=0;
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if (a[i]==a[j]) {
	
			temp=temp+1;
			break;
		}
	}
	if (temp>1) {
		System.out.println(a[i]);
		break;
	}
}
}
}
