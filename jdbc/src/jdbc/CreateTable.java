package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class CreateTable {
	public static void main(String[] args) {
		Connection connection=null;
		Statement createstatement=null;
		try {
			// 1st step loading or register the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			// 2nd step create a connection
			Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=Har@1234");
			// creating a platform(statements)
			Statement createStatement = connection1.createStatement();
			// execute query
			createStatement.execute("create table Sweet(id int,name varchar(40),cost double,quantity double)");
		} catch (SQLException e) {
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
			if (createstatement !=null) {
				try {
					createstatement.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
}
