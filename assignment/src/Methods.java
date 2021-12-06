
public class Methods {
public static void main(String[] args) {
	String s1="deepak";
	String s2="Deepak";
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.charAt(4));
	System.out.println(s2.isEmpty());
	System.out.println(s1.equalsIgnoreCase(s2));
	char[]ch=s2.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		System.out.println(ch[i]);
	}
	System.out.println(s2.concat(s1));
	System.out.println(s1.equals(s2));
	for(int i=0;i<s1.length();i++)
	{
		System.out.println(s1.charAt(i)+" ");
	}
}
}
