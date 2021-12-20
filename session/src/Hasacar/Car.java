package Hasacar;

public class Car {
double cost;
private String engine;
private String musicplayer;
 Car(double cost, String engine, String musicplayer) {
	this.cost = cost;
	this.engine = engine;
	this.musicplayer = musicplayer;
}
@Override
public String toString() {
	return "Car [cost=" + cost + "]";
}


}
