
public class String12 {
public static void main(String[] args) {
	String str="hello good morning";
	String str1="Wow it's nice";
	System.out.println(str.concat(" "+str1));
	String[]res=str.split(" ");
	for (String string : res) {
		System.out.println(string);
	}
	
}
}
