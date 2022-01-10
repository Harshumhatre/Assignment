package com.te.customException2;

public class Marks extends RuntimeException {
String message;

public Marks(String message) {
	super(message);
}

}
