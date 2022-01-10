package com.tejdbcproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrivingData {
public static void main(String[] args) {
	Connection connection=null;
	Statement createStatement=null;
	try {
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/harshaddemo?user=root&password=Har@1234");
		 createStatement = connection.createStatement();
		 ResultSet executeQuery = createStatement.executeQuery("select  * from pg1 where id=2");
		// System.out.println(executeQuery);
		 while (executeQuery.next()) {
//			System.out.println(executeQuery.getString(1)+",");
//		System.out.println(executeQuery.getString(2)+",");
//			System.out.println(executeQuery.getString(3)+",");
			System.out.println("================================");
			System.out.println(executeQuery.getInt(1)+",");
			System.out.println(executeQuery.getString(2)+",");
			System.out.println(executeQuery.getDouble(3)+",");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
