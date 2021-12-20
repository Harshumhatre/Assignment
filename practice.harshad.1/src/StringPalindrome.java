import java.util.Iterator;

public class StringPalindrome {
	public static void main(String[] args) {
		String str = "Nitin";
		String str1 = str.toLowerCase();
		String rev = "";
		for (int i =str1.length()-1 ; i >= 0; i--) {
			rev = rev + str1.charAt(i);
		}
		System.out.println(rev);
		if (str1.equals(rev)) {
			System.out.println("It's palindrome");
		} else {
			System.out.println("it's not a palindrome");
		}
	}
}
