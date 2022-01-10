package com.te.hibernate4;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Girl1 {
	@Id
private int gid;
private String name;
@OneToMany
private List<Boy1> Boys;
public int getGid() {
	return gid;
}
public void setGid(int gid) {
	this.gid = gid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Boy1> getBoys() {
	return Boys;
}
public void setBoys(List<Boy1> boys) {
	Boys = boys;
}
@Override
public String toString() {
	return "Girl [gid=" + gid + ", name=" + name + ", Boys=" + Boys + "]";
}

}
