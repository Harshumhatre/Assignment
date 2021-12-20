package Array;

import java.util.Iterator;

public class SmallestNumber {
	public static void main(String[] args) {
		int []a= {12,21,32,43,54,65,76,87};
		int smallest=a[0];
	  for (int i=0;i<a.length;i++)
	  {
		  if (smallest>a[i]) {
			smallest=a[i];
		}
		  
	  }
	  System.out.println(smallest);
	}

}
