package com.technoch.encapssulation;

public class Student {
	private String name;
	private int id;
	private String branch;
	private double percentage;

	public Student(String name, int id, String branch, double percentage) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
		this.percentage = percentage;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
