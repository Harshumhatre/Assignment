package arrayMockRevision;

import java.util.Scanner;

public class ArrayMaximum {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the length elements of the array");
 int  length=scanner.nextInt();
 int a[]=new int[length];
 for (int i = 0; i < a.length; i++) {
	 System.out.print("Enter the elements of the array"+" ");
	a[i]=scanner.nextInt();
}
 System.out.println("Enter the index of the array");
 int index=scanner.nextInt();
 int temp=0;
 for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if (a[i]<a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	if(i>index-1)
	{
		System.out.println(a[i]);
		break;
	}
}
}
 
}
