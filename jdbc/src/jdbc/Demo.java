package jdbc;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;



public class Demo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		Connection connection = null;
		CallableStatement callStatement = null;
		try {
			connection = DriverManager.getConnection(url, "root", "Har@1234");
			callStatement = connection.prepareCall("call put (?,?,?,?)");
			Scanner scanner = new Scanner(System.in);
			while (true) {
				System.out.println("Enter the id of the sweet");
				int id = scanner.nextInt();
				if (id == 0) {
					break;
				}
				System.out.println("Enter the name of the sweet");
				String name = scanner.next();
				System.out.println("Enter the cost of the sweet");
				double cost = scanner.nextDouble();
				System.out.println("Enter the quantity");
				int kg = scanner.nextInt();
				callStatement.setInt(1, id);
				callStatement.setString(2, name);
				callStatement.setDouble(3, cost);
				callStatement.setInt(4, kg);
				callStatement.execute();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
