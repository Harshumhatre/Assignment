package arrayMockRevision;

public class SortString {
public static void main(String[] args) {
	String str="agcaydcvddj";
	char []ch=str.toCharArray();
	char temp=0;
	for (int i = 0; i < ch.length; i++) {
		for (int j = i+1; j < ch.length; j++) {
			if (ch[i]>ch[j]) {
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
		System.out.print(ch[i]);
	}
}
}
