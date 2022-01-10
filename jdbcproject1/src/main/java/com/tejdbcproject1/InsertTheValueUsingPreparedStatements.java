package com.tejdbcproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTheValueUsingPreparedStatements {
public static void main(String[] args) {
	Connection connection=null;
	try {
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/harshaddemo?user=root&password=Har@1234");
		 //store procedure.
		PreparedStatement prepareStatement = connection.prepareStatement("Insert into pg1 values(?,?,?)");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id");
		int id=scanner.nextInt();
		System.out.println("Enter the name");
		String name=scanner.next();
		System.out.println("Enter the rent");
		double rent=scanner.nextDouble();
		prepareStatement.setInt(1, id);
		prepareStatement.setString(2, name);
		prepareStatement.setDouble(3, rent);
		int executeUpdate = prepareStatement.executeUpdate();
		System.out.println(executeUpdate);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
