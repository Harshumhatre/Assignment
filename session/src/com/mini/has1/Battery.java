package com.mini.has1;

public class Battery {
int mah;
double volt;
double capacity;
public Battery(int mah, double volt, double capacity) {
	super();
	this.mah = mah;
	this.volt = volt;
	this.capacity = capacity;
}
@Override
public String toString() {
	return "Battery [mah=" + mah + ", volt=" + volt + ", capacity=" + capacity + "]";
}

}
