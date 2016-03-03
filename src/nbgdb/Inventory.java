package nbgdb;

import java.util.Scanner;

public class Inventory {

	static Scanner in = new Scanner(System.in);
	InventoryMethods inventorymethods = new InventoryMethods();

	public void inventoryManager(String USR) {
		
		int running = 1;
		General general = new General();  
		
		
		System.out.println("Welcome to the Inventory Management System " + USR);


		while (running == 1) {
			System.out.println("What would you like to do: \n"
					+ "1. Create a purchase order \n"
					+ "2. Identify low stock \n"
					+ "3. Check individual stock level \n"
					+ "4. Add product to catelogue \n"
					+ "5. Logout ");


			String s = in.nextLine();
			switch (s) {
			case "1":
				System.out.println("Select supplier:");
				running = general.contin();		
				break;

			case "2":
				System.out.println("Low stock:");
				running = general.contin();
				break;

			case "3":
				inventorymethods.checkStock();
				running = general.contin();
				break;
				
			case "4":
				System.out.println("Add Product to catelogue");
				running = general.contin();
				break;

			case "5":
				return;
				
			default:
				System.out.println("Invalid option");
				running = general.contin();

			}
		}
	}
	


}
