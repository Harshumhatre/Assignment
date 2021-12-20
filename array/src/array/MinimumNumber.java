package array;

import java.util.Iterator;

public class MinimumNumber {
public static void main(String[] args) {
	int a[]= {10,2033,45,6,7,2};
	int min=a[0];
	for (int i = 1; i < a.length; i++) {
		if (a[i]<min) {
			min=a[i];
		}
	}
	System.out.println(min);
}
}
