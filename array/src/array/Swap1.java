package array;

public class Swap1 {
	public static void main(String[] args) {
int[]a= {1,2,3,4,5,6};
int temp;
 temp=a[0];
a[0]=a[1];
a[1]=temp;
temp=a[2];
a[2]=a[3];
a[3]=temp;
temp=a[4];
a[4]=a[5];
a[5]=temp;
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
	}
}
