package array;

public class BhushanQuestion {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	    a[0]=a[0]%1;
	    
	for (int i = 1; i < a.length; i++) {
		System.out.print(a[i]);
	}
	System.out.print(a[0]);
}
}
