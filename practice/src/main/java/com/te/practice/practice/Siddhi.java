package com.te.practice.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Siddhi {
	@Id
private int id;
private String name;
@OneToOne
private Rahul rahul;
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
public Rahul getRahul() {
	return rahul;
}
public void setRahul(Rahul rahul) {
	this.rahul = rahul;
}
@Override
public String toString() {
	return "Siddhi [id=" + id + ", name=" + name + ", rahul=" + rahul + "]";
}

}
