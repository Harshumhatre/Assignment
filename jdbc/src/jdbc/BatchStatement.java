package jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class BatchStatement {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/jdbcdemo";
	FileReader fileReader;
	Connection connection=null;
	Statement statement=null;
	try {
		fileReader=new FileReader("C:\\Users\\Dell\\Desktop\\Hasha.txt");
		Properties properties = new Properties();
		properties.load(fileReader);
		connection  = DriverManager.getConnection(url,properties);
		statement=connection.createStatement();
		//statement.addBatch("insert into employees values (101,'kumar')");
		statement.addBatch("insert into employees values(103,'Harshad')");
		statement.executeBatch();
	} catch ( Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
