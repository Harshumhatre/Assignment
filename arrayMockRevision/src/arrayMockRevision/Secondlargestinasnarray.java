package arrayMockRevision;

public class Secondlargestinasnarray {
	public static void main(String[] args) {
		int[] a= {10,7,56,34,20};
		int fl=a[0];
		int sl=a[1];
		for(int i=1;i<a.length;i++) {
			if(a[i]>fl) {
				sl=fl;
				fl=a[i];
			}
			
			else if((a[i]>sl)&&(a[i]!=fl))
			{
				sl=a[i];
			}
		}
		System.out.println(sl);
	}

}
