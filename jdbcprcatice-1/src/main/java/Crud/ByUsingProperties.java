package Crud;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ByUsingProperties {
public static void main(String[] args) throws IOException, SQLException {
	Connection connection=null;
	Statement createStatement=null;
	 try {
		FileReader fileReader = new FileReader("C:\\Users\\Dell\\Desktop\\Adwait.txt");
		Properties properties = new Properties();
		properties.load(fileReader);
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation", properties);
		 createStatement = connection.createStatement();
		boolean execute = createStatement.execute("insert into pg values(7,'Ajay',2000)");
		System.out.println(execute);
	} catch (FileNotFoundException e) {
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
