package session;

public class EvenOddUsingDoWhile {
	public static void main(String[] args) {
	int a=1;
	int n=10;
	do
	{
	if(a%2==0)
	{
		System.out.println(a+" is an Even Number");
	}
	else
	{
		System.out.println(a+" is an odd Number");	
	}
	a++;
	}
	while(a<=n);
	}
	}
