package arrayMockRevision;

public class SwapRotate {
public static void main(String[] args) {
	int a[] = {1,2,3,4,5,6,7,8};
	int temp=0;
	int j=a.length-1;
	for (int i = 0; i < a.length/2; i++) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		j--;
	}
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}
}
}
