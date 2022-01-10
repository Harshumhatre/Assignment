package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.StatementWrapper;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

public class RetrivingData {
public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;
	try {
		
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Har@1234");
		statement = connection.createStatement();
		ResultSet result = statement.executeQuery("Select * from Sweet");
		
		while (result.next()) {
			System.out.println(result.getString(1)+",");
			System.out.println(result.getString(2)+",");
			System.out.println(result.getString(3)+",");
			System.out.println(result.getString(4)+",");
			System.out.println("====================================");
			System.out.println(result.getInt(1)+",");
			System.out.println(result.getString(2)+",");
			System.out.println(result.getDouble(3)+",");
			System.out.println(result.getInt(4)+",");
		}
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}
}
