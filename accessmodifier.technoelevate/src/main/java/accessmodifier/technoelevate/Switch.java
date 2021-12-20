package accessmodifier.technoelevate;

public class Switch {
public static void main(String[] args) {
	
			int a=1025;
			switch (a%5) {
			case 0:
			System.out.println("its divisible by 5");
			break;
			case 1:
			System.out.println("its not divisible by 5 bcz reminder is 1");
			break;
			case 2:
			System.out.println("its not divisible by 5 bcz reminder is 2");
			break;
			case 3:
			System.out.println("its not divisible by 5 bcz reminder is 3");
			break;
			case 4:
			System.out.println("its not divisible by 5 bcz reminder is 4");
			break;
			default:
			System.out.println("invalid");
}
			}
}