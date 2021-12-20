
public class StringSpiltreverse {
public static void main(String[] args) {
	String str="This is Mahadev";
	String a[]=str.split(" ");
	for (int i = a.length-1; i >= 0; i--) {
		System.out.println(a[i]);
	}
}
}
