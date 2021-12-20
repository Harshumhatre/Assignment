
public class Conditional {
public static void main(String[] args) {
	int year=1900;
	String res=((year%4==0&&year%100!=0)||(year%400==0))?"year is leap":"year is not a leap";
	System.out.println(res);
}
}
