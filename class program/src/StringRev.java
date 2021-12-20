
public class StringRev {
public static void main(String[] args) {
	String str="nitiN";
	String str1=str.toUpperCase();
	String rev="";
	for (int i =str1.length()-1; i>=0; i--) {
		rev=rev+str1.charAt(i);
	}
	if (rev.equals(str1)) {
		System.out.println("its is palindrome");
	} else {
		System.out.println("its not a palindrome");
	}
}
}
