package com.te.kumudapg_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
import com.mysql.jdbc.Driver;

public class Crud {
public static void main(String[] args) {
	Connection connection=null;
	Statement createStatement=null;
	try {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc123?user=root&password=Har@1234");
		 createStatement = connection.createStatement();
	//	boolean execute = createStatement.execute("create table classroom(classNo int,name varchar(40),branch varchar(10))");
		createStatement.execute("insert into classroom values(3,'Class_C','Electrical')");
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
