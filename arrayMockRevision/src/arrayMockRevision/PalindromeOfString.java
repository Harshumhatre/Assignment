package arrayMockRevision;

public class PalindromeOfString {
public static void main(String[] args) {
	String str="Nitin";
	String res="";
	String str1=str.toLowerCase();
	for (int i = str1.length()-1; i >=0; i--) {
		res=res+str1.charAt(i);
	}
	if (res.equals(str1)) {
		System.out.println("Palindrome");
	} else {
		System.out.println(" not a Palindrome");
	}
}
}
