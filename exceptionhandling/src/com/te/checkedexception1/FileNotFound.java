package com.te.checkedexception1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFound {
public static void main(String[] args) {
	try {
		FileInputStream fileInputStream = new FileInputStream("zxcvvhfnbh");
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println("sorry..File are Not Found");
	}
}
}