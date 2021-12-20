package array;

public class Merge {
public static void main(String[] args) {
	int [] a= {2,1,3,4,5,6,7};
	int [] b= {1,2,3,4};
	int a1=a.length;
	int b1=b.length;
	int c1=a1+b1;
	int c[]=new int [c1];
	for (int i = 0; i < a.length; i++) {
		c[i]=a[i];
	}
	for (int i = 0; i < b.length; i++) {
		c[a.length+i]=b[i];
	}
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]+" ");
	}
}
}
