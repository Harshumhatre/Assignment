package encapsulation;

public class admin2 {
	public static void main(String[] args) {
		Student st=new Student();
		st.set("Rahul","A11",83.8);
		st.get();
		Student st1=new Student();
		st1.set("Harshad","A12",56.50);
		st1.get();
	}
	
}
