package String;

import java.util.Scanner;

public class RemoveVowell {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the elements of the string");
		String str=scanner.next();
		char []ch=str.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < ch.length; i++) {
			boolean repeted=false;
				{
				if ((ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')) {
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
