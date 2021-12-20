import java.util.Scanner;
public class Days {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the year");
		int year = obj.nextInt();
		System.out.println("Enter the month");
		int month = obj.nextInt();
		if (((year%4==0)&&(year%100==0)) || (year%400==0))
		{
		 if ((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))
			{
				System.out.println("this year is Leap Year and this month 31 days are present");
			}
		 else if (month==2)
		 {
			 System.out.println("this year is Leap Year and this month 29 days are present");
		 }
		 else 
			{
				System.out.println("this year is Leap Year and this month 30 days are present");
			}
		}
		else
		{
			 if ((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))
				{
					System.out.println("this year is not a Leap Year and this month 31 days are present");
				}
			 else if (month==2)
			 {
				 System.out.println("this year is not Leap Year and this month 28202 days are present");
			 }
			 else 
			{
				System.out.println("this year is not a Leap Year and this month 30 days are present");
			}
			
		}
		
	}

}
