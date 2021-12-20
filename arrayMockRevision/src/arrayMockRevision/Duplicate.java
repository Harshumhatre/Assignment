package arrayMockRevision;

import java.util.Scanner;
import java.util.logging.Formatter;

public class Duplicate {
public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the length of the element");
//	int length=sc.nextInt();
//	System.out.println("Enter the elements of the array");
//	int a[]= new int[length];
//	for (int i = 0; i < a.length; i++) {
//		a[i]=sc.nextInt();
//	}
	int a[]= {1,2,2,3,3,4,5,6,7,1};
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]==a[j]) {
			System.out.println(a[i]);
			}
		}
	}
}
}
