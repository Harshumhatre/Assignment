package com.technoch.hasa;

public class Battery {
String brand;
String mah;
String volt;
public Battery(String brand, String mah, String volt) {
	super();
	this.brand = brand;
	this.mah = mah;
	this.volt = volt;
}
@Override
public String toString() {
	return "Battery [brand=" + brand + ", mah=" + mah + ", volt=" + volt + "]";
}

}
