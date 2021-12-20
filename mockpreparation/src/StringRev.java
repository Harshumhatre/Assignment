
public class StringRev {
public static void main(String[] args) {
	String str="Harshad";
	char[]ch=str.toCharArray();
	for (int i = ch.length-1; i>=0; i--) {
		System.out.print(ch[i]);
	}
	System.out.println();
	for (int i = str.length()-1; i >=0; i--) {
		System.out.print(str.charAt(i));
	}
	System.out.println();
	StringBuffer stringBuffer = new StringBuffer(str);
	System.out.println(stringBuffer.reverse());
}
}
