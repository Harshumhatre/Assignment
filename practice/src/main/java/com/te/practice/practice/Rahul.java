package com.te.practice.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Rahul {
	@Id
private int id;
private String name;
private double sal;
@OneToOne
private Siddhi siddhi;
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
public Siddhi getSiddhi() {
	return siddhi;
}
public void setSiddhi(Siddhi siddhi) {
	this.siddhi = siddhi;
}
@Override
public String toString() {
	return "Rahul [id=" + id + ", name=" + name + ", sal=" + sal + ", siddhi=" + siddhi + "]";
}


}
