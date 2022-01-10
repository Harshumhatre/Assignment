package com.te.kumudapg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Crud {
public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;
	try {
			//load the driver class
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);  //registered the driverManager
			//create a connection
			//create a platform
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcharshad?user=root&password=Har@1234");
			statement = connection.createStatement();
			//statement.execute("create table pg(id int,name varchar(40),rent double)");
		//	boolean execute = statement.execute("insert into pg values(1,'Harshad_mhatre',6000.10)");
			 statement.execute("Delete from pg where id=1");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	finally {
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
		if (statement!=null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
}
