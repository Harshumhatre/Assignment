package com.te.checkedexception;

public class CheckedExceptionUsingTryAndCatchBlock {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Handle during compile time");
	}
}
}
