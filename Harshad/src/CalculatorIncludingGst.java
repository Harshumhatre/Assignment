import java.util.Scanner;
public class CalculatorIncludingGst {
public static void addition()
{
double firstnumber,secondnumber;
Scanner obj=new Scanner(System.in);
System.out.println("Addition");
System.out.println("First number:");
firstnumber=obj.nextInt();
System.out.println("second number:");
secondnumber=obj.nextInt();
System.out.println("sum :"+firstnumber +"+"+ secondnumber+"="+(firstnumber+secondnumber));
}
public static void Substraction()
{
double firstnumber,secondnumber;
Scanner obj=new Scanner(System.in);
System.out.println("Substraction");
System.out.println("First number:");
firstnumber=obj.nextInt();
System.out.println("second number:");
secondnumber=obj.nextInt();
System.out.println("substraction :"+firstnumber +"-"+ secondnumber+"="+(firstnumber-secondnumber));
}
public static void Multiplication()
{
double firstnumber,secondnumber;
Scanner obj=new Scanner(System.in);
System.out.println("Multiplication");
System.out.println("First number:");
firstnumber=obj.nextInt();
System.out.println("second number:");
secondnumber=obj.nextInt();
System.out.println("Multiplication :"+firstnumber +"*"+ secondnumber+"="+(firstnumber*secondnumber));
}
public static void Division()
{
double firstnumber,secondnumber;
Scanner obj=new Scanner(System.in);
System.out.println("Division");
System.out.println("First number:");
firstnumber=obj.nextInt();
System.out.println("second number:");
secondnumber=obj.nextInt();
System.out.println("Division :"+firstnumber +"/"+ secondnumber+"="+(firstnumber/secondnumber));	
}
public static void Gst()
{
double firstnumber,secondnumber;
Scanner obj=new Scanner(System.in);
System.out.println("Gst");
System.out.println("including:");
firstnumber=obj.nextInt();
System.out.println("excluding:");
secondnumber=obj.nextInt();
System.out.println("Gst :"+((firstnumber-secondnumber)*100/secondnumber));	
}
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Gst");
	System.out.print("what would you like to operate:");
	int operation=obj.nextInt();
	System.out.println("---------------");
	if (operation==1) {
		addition();	
	}
	else if(operation==2)
	{
		Substraction();
	}
	else if(operation==3)
	{
		Multiplication();
	}
	else if(operation==4)
	{
		Division();
	}
	else if (operation==5)
	{
		Gst();
	}				
}
}
