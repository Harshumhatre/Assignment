package encapsulation.com;

final class Student {
	String stdname;
	String branch;
	int id;
	private double percentage;
	public Student(String stdname, String branch, int id, double percentage) {
		super();
		this.stdname = stdname;
		this.branch = branch;
		this.id = id;
		this.percentage = percentage;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [stdname=" + stdname + ", branch=" + branch + ", id=" + id + ", percentage=" + percentage + "]";
	}
	
}
