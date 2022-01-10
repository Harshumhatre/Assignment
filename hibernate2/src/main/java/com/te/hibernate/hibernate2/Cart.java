package com.te.hibernate.hibernate2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Cart {
	@GeneratedValue(strategy = GenerationType.AUTO)
private int itemno;
private int itemcost;
private String brand;
public int getItemno() {
	return itemno;
}
public void setItemno(int itemno) {
	this.itemno = itemno;
}
public int getItemcost() {
	return itemcost;
}
public void setItemcost(int itemcost) {
	this.itemcost = itemcost;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
@Override
public String toString() {
	return "Cart [itemno=" + itemno + ", itemcost=" + itemcost + ", brand=" + brand + "]";
}

}
