package String;

public class P1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s1 = "Hello world this is harshad...";
			String s2 = "Hello world";
			System.out.println(s1.compareTo(s2));
			System.out.println(s1.charAt(4));
			System.out.println(s2.isEmpty());
			char[]ch=s2.toCharArray();//String to character array...
			for (int i = 0; i < ch.length; i++) {
				System.out.println(ch[i]);
			}
			System.out.println(s2.concat(s1));
			System.out.println(s1.equals(s2));
			for (int i = 0; i < s1.length(); i++) {
				System.out.println(s1.charAt(i) + " ");
			}
		}

	}
