//remove duplicate
public class S3 {
public static void main(String[] args) {
	String str="hello";
	char[]ch=str.toCharArray();
	StringBuilder sb=new StringBuilder();
	for (int i = 0; i < ch.length; i++) {
		boolean repated=false;
		for (int j = i+1; j < ch.length; j++) {
			if (ch[i]==ch[j]) {
				repated=true;
			}
		}
		if (!repated) {
			sb.append(ch[i]);
		}
	}
	System.out.println(sb);
}
}
