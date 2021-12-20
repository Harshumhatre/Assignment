package encapsulation.com;

public class College {
public static void main(String[] args) {
	Student student = new Student("harshad", "Mechanical", 413, 7.06);
	System.out.println(student.getPercentage());
	student.setPercentage(8.34);
	System.out.println(student.getPercentage());
}
}
