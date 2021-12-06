package assignment3;

public class SumFirstALastDigit {

	public static void main(String[] args) 
	{
		int num=324;
		int fd;
		int ld;
		int sum;
		ld=num%10;
		System.out.println("Last Digit = "+ld);
		while (num>10)
		{
			num=num/10;
		}
		fd=num;
		System.out.println("First Digit = "+fd);
		
		sum=fd+ld;
		System.out.println("Total Sum = "+sum);
	}
}