
public class Palindrome {
public static void main(String[] args) {
	int num=121;
	int rev=0;
	int temp=num;
	while (temp!=0) {
		rev=rev*10+temp%10;
		temp=temp/10;
	}
	if (rev==num) {
		System.out.println("its a palindrome");
	} else {
		System.out.println("its not a palindrome");
	}
}
}
