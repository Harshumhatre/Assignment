package Crud;

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
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation?user=root&password=Har@1234");
		 createStatement = connection.createStatement();
		 ResultSet executeQuery = createStatement.executeQuery("select * from pg where id=1");
		 while (executeQuery.next()) {
			System.out.println(executeQuery.getString(1)+",");
			System.out.println(executeQuery.getString(2)+",");
			System.out.println(executeQuery.getString(3)+",");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
