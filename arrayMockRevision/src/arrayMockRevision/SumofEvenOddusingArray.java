package arrayMockRevision;

public class SumofEvenOddusingArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int count = 0;
		int sum = 0;
			System.out.println("Even number are =");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println( a[i]);
				count++;
				sum = sum + a[i];
			}
		}
		System.out.println("The sum of even numbers are=" + sum);
		System.out.println("Total Even number are=" + count);
		int sum1 = 0;
		int count1 = 0;
		System.out.println("odd number are");
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 != 0) {
				System.out.println( a[j]);
				count1++;
				sum1 = sum1 + a[j];
			}
		}
		System.out.println("The sum of odd numbers are=" + sum1);
		System.out.println("Total odd number are=" + count1);
	}
}