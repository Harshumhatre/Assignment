package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;

public class InsertData {
public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Har@1234");
		statement=connection.createStatement();
		boolean execute = statement.execute("insert into sweet values(101,'mysoure pak',10,1)");
		boolean execute1 = statement.execute("insert into sweet values(102,'halwa pak',20,2)");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
		if (connection !=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if (statement!=null) {
			try {
				statement.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}
}
}
