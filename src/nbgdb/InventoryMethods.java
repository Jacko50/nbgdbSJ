package nbgdb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class InventoryMethods {

	Scanner in = new Scanner(System.in);
	PlsqlConnector plsqlConnector = new PlsqlConnector();
	General general = new General();


	public void createPurchaseOrder() {

	}

	public void checkLowStock() {

	}

	public void checkStock() {

		ArrayList<String> productID = new ArrayList<String>();
		ArrayList<String> productName = new ArrayList<String>();
		ArrayList<Integer> productQuant = new ArrayList<Integer>();
		ArrayList<Integer> productMinStock = new ArrayList<Integer>();
		ResultSet rs = null;
		Connection conn = null;
		Statement stmt = null;

		
		System.out.println("Which product would you like to check?");
		String product = in.nextLine();
		System.out.println(product);

		conn = plsqlConnector.oracleDbConnect(DatabaseFace.USR, DatabaseFace.PWD);

		try {
			stmt = conn.createStatement();
			String sql = "select * from system.product where productname like '%"+ product + 
					"%' or productid like '%" + product + "%'";
				System.out.println(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				productID.add(rs.getString("PRODUCTID").toLowerCase());
				productName.add(rs.getString("PRODUCTNAME").toLowerCase());
				productQuant.add(rs.getInt("QUANTITIY"));
				productMinStock.add(rs.getInt("MINSTOCK"));
			}	
			rs.close();
			plsqlConnector.oracleDbDisconnect(conn);
			
			System.out.println("Product ID    Product Name    Quantity    Minmum Stock Level");
			for (int i = 0; i < productID.size(); i++) {
			System.out.println(productID.get(i) + "    " + productName.get(i) + "    " + productQuant.get(i) + "    " + productMinStock.get(i) + " \n ");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addProduct() {

	}

}
