package com.te.Servelets.HibernateFisrtProgram;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

@Entity
public class Address {
	@Id
private int addressId;
	@Column(length = 50,name="ADDRESS_Line")
private String StreetName;
	@Column(name="STREET")
private boolean isopen;
	@Transient
private double x;
	@Lob
	private byte[] image;
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getStreetName() {
	return StreetName;
}
public void setStreetName(String streetName) {
	StreetName = streetName;
}
public boolean isIsopen() {
	return isopen;
}
public void setIsopen(boolean isopen) {
	this.isopen = isopen;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}

public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
public Address(int addressId, String streetName, boolean isopen, double x, byte[] image) {
	super();
	this.addressId = addressId;
	StreetName = streetName;
	this.isopen = isopen;
	this.x = x;
	this.image = image;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", StreetName=" + StreetName + ", isopen=" + isopen + ", x=" + x + "]";
}

}
