package com.te.checkedexception;
import java.io.FileInputStream;
public class C1 {
public static void main(String[] args) {
	try {
		FileInputStream obj=new FileInputStream("d:/abc.txt");
	} catch (Exception e) {
		System.out.println("Checked Exception occured");
	}
}
}
