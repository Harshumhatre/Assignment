package array;
import java.util.Iterator;
import java.util.Scanner;
public class DuplicatesvaluesForelement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of duplicate value which you want ");
	int no=sc.nextInt();
	System.out.println("Enter the length of the array");
	int length=sc.nextInt();
	int a[]=new int[length];
	System.out.println("Enter the elements of array");
	for (int i = 0; i < length; i++) {
		a[i]=sc.nextInt();
	}
	int temp=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]==a[j]) {
				System.out.println(a[i]);
				temp=temp+1;
				break;
			}
			
		}
		if (temp>no) {
			System.out.println(a[i]);
			break;
		} 
	}
}
}
