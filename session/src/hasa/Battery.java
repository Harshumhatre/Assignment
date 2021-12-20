package hasa;

public class Battery {
double mah;
double volt;
String brand;
public Battery(double mah, double volt, String brand) {
	super();
	this.mah = mah;
	this.volt = volt;
	this.brand = brand;
}
@Override
public String toString() {
	return "Battery [mah=" + mah + ", volt=" + volt + ", brand=" + brand + "]";
}

}
