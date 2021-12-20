import java.util.Scanner;
public class LeapYear {
	Scanner obj=new Scanner(System.in);
	int year = obj.nextInt();
	public static void main(String[] args) {
	if ((year%100==0)&&(year%4==0)) || (year%400==0))
	{
		System.out.println("It is a leap yaer");
	}
	else
	{
		System.out.println("it is not a leap year");
	}
}

}
