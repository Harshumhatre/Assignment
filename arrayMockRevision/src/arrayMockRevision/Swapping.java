package arrayMockRevision;

public class Swapping {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8};
	int temp;
	int i=0;
	while (i<a.length) {
		temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
		i=i+2;
	}
	for (int j = 0; j < a.length; j++) {
		System.out.print(a[j]+" ");
	}	
}
}
