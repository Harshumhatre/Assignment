package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingPrepareStmt {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "Har@1234");
			statement = connection.prepareStatement("insert into Sweet values(?,?,?,?)");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Sweet Id");
			int Id = scanner.nextInt();
			System.out.println("Enter the sweet");
			String Sweet = scanner.next();
			statement.setInt(1, Id);
			statement.setString(2, Sweet);
			statement.setDouble(3, 50);
			statement.setInt(4, 1);
			int executeUpdate = statement.executeUpdate();
			System.out.println(executeUpdate);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
