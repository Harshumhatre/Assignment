package setassignment;

public class Team {
	String name;
	int age;
	int num;
	int count1;
	static int count;

	public static void check(int count1) {
		if (count1 > 11) {
			throw new Except("more than 11 player are not allowed");
		}
	}

	public Team(String name, int age, int num, int count1) {
		super();
		this.name = name;
		this.age = age;
		this.num = num;
		this.check(count);
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", age=" + age + ", num=" + num + ", count1=" + count1 + "]";
	}

}
