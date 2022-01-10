package com.te.cart;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	@Id
private int itemno;
private double price;
private String name;
@ManyToOne
private Cart cart;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getItemno() {
	return itemno;
}
public void setItemno(int itemno) {
	this.itemno = itemno;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
@Override
public String toString() {
	return "Item [itemno=" + itemno + ", price=" + price + ", name=" + name + ", cart=" + cart + "]";
}

}
