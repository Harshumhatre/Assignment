package String;

import java.util.Scanner;

public class FindOutDuplicate {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the elements of the string");
	String str=scanner.next();
	char []ch=str.toCharArray();
	StringBuilder stringBuilder = new StringBuilder();
	for (int i = 0; i < ch.length; i++) {
		boolean repeted=false;
		for (int j = i+1; j < ch.length; j++) {
			if (ch[i]==ch[j]) {
				repeted=true;
			}
		}
		if (!repeted) {
			stringBuilder.append(ch[i]);
		}
	}
	System.out.println(stringBuilder);
}
}
