 
public class Switch {
	public static void main(String[] args) {
		switch (2) {             // we cannot put the double here we get error
		case 1:
			System.out.println("from1");
		case 2:
			System.out.println("from2");
		case 3:
			System.out.println("from3");
		default:
			System.out.println("from default");
		}
	}

}