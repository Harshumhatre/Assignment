
public class String3 {
int sal;
String name;
int age;
public String3(int sal, String name, int age) {
	super();
	this.sal = sal;
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "String3 [sal=" + sal + ", name=" + name + ", age=" + age + "]";
}
public static void main(String[] args) {
	String3 string3 = new String3(10000, "harshad", 24);
	System.out.println(string3);
}
}
