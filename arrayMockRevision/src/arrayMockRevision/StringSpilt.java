package arrayMockRevision;

public class StringSpilt {
public static void main(String[] args) {
	String str="Harshad is This Hi";
	String str2="Good morning to all of you";
	String[] res=str.split(" ");
	String[]res1=str2.split(" ");
	for (int i = res.length-1; i >=0; i--) {
		System.out.println(res[i]);
	}
	for (int i = 0; i < res1.length; i++) {
		System.out.println(res1[i]);
	}
	
}
}
