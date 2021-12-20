package Array;

public class LargestNumber {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int largest=a[0];
	for(int i=0;i<a.length;i++)
	{
		if (largest<a[i]) {
		
			largest=a[i];
		}
	}
	System.out.println(largest);
	
}
}
