package array;
import java.util.ArrayList;
import java.util.Scanner;
public class EvenOddSumCount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array");
	int length=sc.nextInt();
	System.out.println("Enter the Elements of an array");
	int a[]=new int[length];
	for (int i = 0; i < length; i++) {
		a[i]=sc.nextInt();
	}
	ArrayList<Integer> obj=new ArrayList<>();
	ArrayList<Integer> obj1=new ArrayList<>();
	for (int i = 0; i < a.length; i++) {
		if (a[i]%2==0) {
			obj.add(a[i]);
		} else {
			obj1.add(a[i]);
		}
	}
	System.out.println("Even Number");
	int total=0;
	for (int no : obj) {
		System.out.println(no);
		total=total+no;
	}
	System.out.println("Sum of an even number "+total);
	System.out.println("count of an Even number");
	System.out.println(obj.size());
 System.out.println("odd number");
 int total1=0;
	for (int no1 : obj1) {
		System.out.println(no1);
	 total1=total1+no1;
	}
	System.out.println("Sum of an odd number "+ total1);
	System.out.println("count of an odd number");
	System.out.println(obj1.size());
}
}
