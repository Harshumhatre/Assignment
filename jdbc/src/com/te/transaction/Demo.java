package com.te.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Demo {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		Savepoint setSavepoint=null;
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		try {
			connection = DriverManager.getConnection(url,"root","Har@1234");
			Statement stm = connection.createStatement();
			stm.execute("insert into transition values (1,'unlocking by fingerprint')");
			stm.execute("insert into transition values (2,'Entering the pin')");
			stm.execute("insert into transition values (3,'check the balance')");
			System.out.println("Balance is =90");
			setSavepoint = connection.setSavepoint();
			stm.execute("insert into transition values (4,'Debitingb the amount')");
			stm.execute("insert into transition values (5,'transfer through network')");
			stm.execute("insert into transition values (6,'crediting to amount')");
			System.out.println("Transition complited!tinding!!");
			connection.commit();
		} catch (Exception e) {
			// TODO: handle exception
			try {
				connection.rollback(setSavepoint);
				connection.commit();
			} catch (Exception e2) {
				
			}
			System.out.println("Transition failed");
		}

	}
}
