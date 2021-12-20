package array;

public class MaximumValue {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 3, 4, 1, 9 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
