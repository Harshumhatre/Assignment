package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	private int id;
	private String name;
	private double sal;
	private String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", sal=" + sal + ", designation=" + designation + "]";
	}


}
