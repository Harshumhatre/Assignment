package com.te.hibernate.hibernate2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Boy {
	@Id
private int bid;
private String name;
private double bsal;
@ OneToOne
private Girl girl;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBsal() {
	return bsal;
}
public void setBsal(double bsal) {
	this.bsal = bsal;
}

public Girl getGirl() {
	return girl;
}
public void setGirl(Girl girl) {
	this.girl = girl;
}
@Override
public String toString() {
	return "Boy [bid=" + bid + ", name=" + name + ", bsal=" + bsal + ", girl=" + girl + "]";
}


}
