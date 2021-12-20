package arrayMockRevision;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
	public static void removeduplicate(int a[])
	{
	LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
	for (int i = 0; i < a.length; i++) {
		linkedHashSet.add(a[i]);
	}
	System.out.println(linkedHashSet);
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,5,4,3,2,1};
		removeduplicate(a);
	}
}
