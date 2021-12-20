
public class String4 {
public static void main(String[] args) {
	String str="harshad";
	char[]ch=str.toCharArray();
	StringBuffer stringBuffer = new StringBuffer();
	for (int i = 0; i < ch.length; i++) {
		boolean repeated=false;
		for (int j = i+1; j < ch.length; j++) {
			if (ch[i]==ch[j]) {
				repeated=true;
			}
		}
		if (!repeated) {
			stringBuffer.append(ch[i]);
		}
	}
	System.out.println(stringBuffer);
}
}
