package com.mini.has1;

import hasa.Battery;
import hasa.Harddisk;
import hasa.OperatingSystem;

public class Laptop {
	double cost;
private  Battery battery;
private OperatingSystem os;
private Harddisk hd;

public Laptop(double cost, Battery battery, OperatingSystem os, Harddisk hd) {
	super();
	this.cost = cost;
	this.battery = battery;
	this.os = os;
	this.hd = hd;
}

@Override
public String toString() {
	return "Laptop [cost=" + cost + ", battery=" + battery + ", os=" + os + ", hd=" + hd + "]";
}


}
