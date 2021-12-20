package primenumbers;

public class PrimeNumber {
	public static boolean isprime1(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 20;
		for (int i = num1; i <= num2; i++) {
			if (isprime1(i)) {
				System.out.println(i);
			}
		}
	}
}
