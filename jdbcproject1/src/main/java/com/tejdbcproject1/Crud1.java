package com.tejdbcproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Crud1 {
public static void main(String[] args) {
	Connection connection=null;
	Statement createStatement=null;
	try {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/harshaddemo?user=root&password=Har@1234");
		 createStatement = connection.createStatement();
		// createStatement.execute("create table pg1(id int,name varchar(40),rent double)");
		// boolean execute = createStatement.execute("Insert into pg1 values(1,'harshad',6000)");
		 createStatement.execute("Delete from pg1 where id=1");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (createStatement!=null) {
			try {
				createStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
}
