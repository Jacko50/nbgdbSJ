package nbgdb;

import java.util.Scanner;

public class Warehouse {
	
	static Scanner in = new Scanner(System.in);
	
	public void warehouseManager(String USR) {
		
		int running = 1;
		General general = new General();  
		
		
		System.out.println("Welcome to the Warehouse Management System " + USR);
		
		
		
		while (running == 1) {
			System.out.println("What would you like to do: \n"
					+ "1. Decrease stock level \n"
					+ "2. Increase stock level \n"
					+ "3. Locate an item \n"
					+ "4. Logout ");


			String s = in.nextLine();
			switch (s) {
			case "1":
				System.out.println("Select item:");
				running = general.contin();		
				break;

			case "2":
				System.out.println("Select Item:");
				running = general.contin();
				break;

			case "3":
				System.out.println("Select item");
				running = general.contin();
				break;

			case "4":
				return;
				
			default:
				return;

			}
		}
		
		
		
		
		return;
		
	}

}
