package array1;

public class Smallest {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	int smallest=a[0];
	for(int i=0;i<a.length;i++)
	{
		if (smallest>a[i]) {
			smallest=a[i];
		}
	}
	System.out.println(smallest);
}
}
