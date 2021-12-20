package array;

public class Palindrome {
public static void main(String[] args) {
	int num=1221;
	int temp=num;
	int rev=0;
	while (temp!=0) {
		rev=rev*10+temp%10;
		temp=temp/10;
	}
	if (num==rev) {
		System.out.println("palindrome");
	} else {
		System.out.println("it's not a palindrome");
	}
}
}
