package assignment;
public class A2 {
public void test(int a)
 {
	System.out.println("1st method executed");
 }
public void test(int...a)
{
System.out.println("2nd metod executed");
for (int i : a) {
	System.out.println(i);
	
}

}
public static void main(String[] args) {
	A2 obj=new A2();
	obj.test(10);
	obj.test(10,20,30,40);
}
}
