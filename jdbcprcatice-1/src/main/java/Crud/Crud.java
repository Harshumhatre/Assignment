package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Crud {
public static void main(String[] args)  {
	Driver driver;
	Connection connection=null;
	Statement createStatement=null;
	try {
		driver = new Driver();
		DriverManager.registerDriver(driver);
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation? user=root&password=Har@1234");
		 createStatement = connection.createStatement();
		// boolean execute = createStatement.execute("create table pg(id int,name varchar(40), rent double)");
		// boolean execute = createStatement.execute("insert into pg values(1,'Harshad_Mhatre',10000)");
		 createStatement.execute("Delete from pg where id=1");
		 
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
