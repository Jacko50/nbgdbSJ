package nbgdb;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class PlsqlConnector {

	public void jdbcTest() {

		System.out.println("-------- Oracle JDBC Connection Testing ------");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
		}
		System.out.println("Oracle JDBC Driver Registered!");
	}
	
	public Connection oracleDbConnect(String USR, String PWD) {
		Connection connection = null;
		
		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	//	String USR = "SYSTEM";
	//	String PWD = "1234";
		try {
			connection = DriverManager.getConnection(URL, USR, PWD);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}

		if (connection != null) {
	//		System.out.println("You made it, take control of your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		return connection;
	}
	

	public void oracleDbDisconnect(Connection connection) {
	//	Connection connection = null;
		try {
			connection.close();
	//		System.out.println("Connection dropped successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
