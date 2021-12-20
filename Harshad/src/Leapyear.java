import java.util.Scanner;
public class Leapyear {
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int year = obj.nextInt();
	if (((year%4==0)&&(year%100==0)) || (year%400==0))
	{
		System.out.println("It is a leap yaer");
	}
	else
	{
		System.out.println("it is not a leap year");
	}
}

}