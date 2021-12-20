package Inheritance;

public class Stringpalindrome {
public static void main(String[] args) {
	String str="Nitin";
	String rev="";
	char []ch=str.toCharArray();
	for (int i = ch.length-1; i >= 0; i--) {
		rev=rev+str.charAt(i);
	}
	if (str.equalsIgnoreCase(rev)) {
		System.out.println("it is palindrome");
	} else {
		System.out.println("It is not a palindrome");
	}
}
}
