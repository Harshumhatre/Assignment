package com.mini.has1;

public class OperatingSystem {
int brand;
double bit;
int core;
public OperatingSystem(int brand, double bit, int core) {
	super();
	this.brand = brand;
	this.bit = bit;
	this.core = core;
}
public OperatingSystem(String string, int bit2, int core2) {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "OperatingSystem [brand=" + brand + ", bit=" + bit + ", core=" + core + "]";
}

}
