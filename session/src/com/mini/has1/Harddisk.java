package com.mini.has1;

public class Harddisk {
String brand;
int storage;
int type;
public Harddisk(String string, int storage, int type) {
	super();
	this.brand = string;
	this.storage = storage;
	this.type = type;
}
@Override
public String toString() {
	return "Harddisk [brand=" + brand + ", storage=" + storage + ", type=" + type + "]";
}


}
