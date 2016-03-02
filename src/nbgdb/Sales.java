package nbgdb;

import java.util.Scanner;

public class Sales {
	
	static Scanner in = new Scanner(System.in);
	
	public void salesManager(String USR) {
		
		int running = 1;
		General general = new General();  
		
		
		System.out.println("Welcome to the Sales Management System " + USR);
		
		
		while (running == 1) {
			System.out.println("What would you like to do: \n"
					+ "1. Check stock level \n"
					+ "2. Check item details \n"
					+ "3. Check personalisation options \n"
					+ "4. Logout ");


			String s = in.nextLine();
			switch (s) {
			case "1":
				System.out.println("Select item:");
				running = general.contin();		
				break;

			case "2":
				System.out.println("Select item:");
				running = general.contin();
				break;

			case "3":
				System.out.println("Select item:");
				running = general.contin();
				break;
		
			case "4":
				return;
				
			default:
				System.out.println("Invalid option \n");
				running = 1;

			}
		}
		
		
		
		return;
		
	}

}
