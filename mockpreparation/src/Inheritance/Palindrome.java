package Inheritance;

public class Palindrome {
public static void main(String[] args) {
	String str="mom";
	String rev="";
	char []ch=str.toCharArray();
	for (int i = ch.length-1; i>=0; i--) {
		rev=rev+str.charAt(i);
	}
	if (str.equals(rev)) {
		System.out.println("palindrome");
	} else {
		System.out.println("it is not a palindrome");
	}
}
}
