package com.te.cart;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Cart {
	@Id
private int id;
private String name;
private int cost;
@OneToMany//(mappedBy = "Cart")
private List<Item> item;
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
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public List<Item> getItem() {
	return item;
}
public void setItem(List<Item> item) {
	this.item = item;
	
}
@Override
public String toString() {
	return "Cart [id=" + id + ", name=" + name + ", cost=" + cost + ", item=" + item + "]";
}


}
