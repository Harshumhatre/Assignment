
public class S1 {
public static void main(String[] args) {
	String str="nitinh";
	String res="";
	char ch[]=str.toCharArray();
	for (int i = ch.length-1; i >=0; i--) {
		res=res+str.charAt(i);
	}
	if (res.equals(str)) {
		System.out.println("palindrome");
	} else {
		System.out.println("it is not a palindrome");
	}
}
}
