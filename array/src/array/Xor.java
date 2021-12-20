package array;
import java.util.Scanner;
public class Xor {  // Missing number
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of an array");
	int length=sc.nextInt();
	int a[]=new int[length];
	for (int i = 0; i < length; i++) {
		a[i]=sc.nextInt();
	}
	int res=a[0];
	for (int i = 1; i < length; i++) {
		res=res^a[i];
	}
	int res2=1;
	for (int i = 2 ; i <=length+1; i++) {
		res2=res2^i;
	}
	System.out.println(res^res2);
}
}

