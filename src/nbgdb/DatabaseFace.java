package nbgdb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseFace {

	static Scanner in = new Scanner(System.in);	
	static String USR = null;
	static String PWD = null;	

	public int databaseFace() {
		General general = new General();
		
		System.out.println("Enter Username");
		USR = in.nextLine().toLowerCase();
		
		if (USR.equals("exit")) System.exit(0);
		
		System.out.println("Enter Password");
		PWD = in.nextLine();
		PlsqlConnector plsqlConnector = new PlsqlConnector();

		String dptid = "N/A";
		String usrname = "N/A";
		ResultSet rs = null;
		Connection conn = null;
		Statement stmt = null;


		conn = plsqlConnector.oracleDbConnect(USR, PWD);
	//	System.out.println("Successful Login");

		try {
			stmt = conn.createStatement();
			String sql = "select emp.departmentid, emp.username, emp.fullname, dpt.departmentid, "
					+ "dpt.departmentname from system.employee emp join system.department dpt "
					+ "on emp.departmentid = dpt.departmentid where emp.username = '" + USR + "'";
		//	System.out.println(sql);
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				dptid = rs.getString("departmentname").toLowerCase();
				usrname = rs.getString("fullname");
		//		System.out.println("user " + USR + " has department name " + dptid);
			}
			plsqlConnector.oracleDbDisconnect(conn);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		switch ( dptid ) {
		case "inventory": 
			Inventory inventory = new Inventory();
			inventory.inventoryManager(usrname);
			break;
		
		case "sales": 
			Sales sales = new Sales();
			sales.salesManager(usrname);			
			break;

		case "accounts":
			Accounts accounts = new Accounts();
			accounts.accountsManager(usrname);
			break;
		case "warehouse":
			Warehouse warehouse = new Warehouse();
			warehouse.warehouseManager(usrname);

		default: 
			return 0;

		}
		
		return general.logout();
	}
	
	
}
