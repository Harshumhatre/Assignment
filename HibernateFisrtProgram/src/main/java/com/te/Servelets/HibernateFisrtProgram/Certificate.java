package com.te.Servelets.HibernateFisrtProgram;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
String Coarse;
String Duration;
public Certificate(String coarse, String duration) {
	super();
	Coarse = coarse;
	Duration = duration;
}
public Certificate() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCoarse() {
	return Coarse;
}
public void setCoarse(String coarse) {
	Coarse = coarse;
}
public String getDuration() {
	return Duration;
}
public void setDuration(String duration) {
	Duration = duration;
}
@Override
public String toString() {
	return "Certificate [Coarse=" + Coarse + ", Duration=" + Duration + "]";
}

}
