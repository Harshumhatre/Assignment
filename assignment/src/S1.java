
public class S1 {
public static void main(String[] args) {
	String str="inar";
	char [] ch=str.toCharArray();
	for (int i = ch.length-1; i >=0; i--) {
		System.out.print(ch[i]);
	}
	System.out.println();
	for (int i =str.length()-1; i >=0; i--) {
		System.out.print(str.charAt(i));
	}
	System.out.println();
	StringBuffer sb=new StringBuffer(str);
	System.out.println(sb.reverse());
	System.out.println();
	StringBuilder sb1=new StringBuilder(str);
	System.out.println(sb1.reverse());
}
}
