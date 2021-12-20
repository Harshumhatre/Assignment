import java.util.LinkedHashSet;

public class ArrayDuplicateRemove {
	public static void removeduplicate(int[]a)
	{
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		System.out.println(linkedHashSet.add(a));
	}
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,1,2,3};
	removeduplicate(a);
}
}
