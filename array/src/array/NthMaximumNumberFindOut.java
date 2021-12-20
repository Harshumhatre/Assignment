package array;
import java.util.Iterator;
import java.util.Scanner;
public class NthMaximumNumberFindOut {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of index which you want to find Max");
	int index=sc.nextInt();
	System.out.println("enter length=");
	int length=sc.nextInt();
	int a[]=new int[length];
	for (int i = 0; i < length; i++) {
		a[i]=sc.nextInt();
	}
	int temp;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}			
		}
		if (i==index-1) {
			System.out.println(a[i]);
		}
	}
}
}
