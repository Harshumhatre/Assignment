package arrayMockRevision;

public class StringRemoveDuplicate {
	public static void main(String[] args) {
		String str = "harshad";
		char[] ch = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			boolean repeted = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					repeted = true;
				}
			}
			if (!repeted) {
				stringBuffer.append(ch[i]);
			}
		}
		System.out.print(stringBuffer);
	}
}
