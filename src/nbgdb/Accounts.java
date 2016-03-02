package nbgdb;

import java.util.Scanner;

public class Accounts {
	
	static Scanner in = new Scanner(System.in);
	
	public void accountsManager(String USR) {
		
		int running = 1;
		General general = new General();  
		
		
		System.out.println("Welcome to the Accounts Management System " + USR);
		
		while (running == 1) {
			System.out.println("What would you like to do: \n"
					+ "1. Look up sales data \n"
					+ "2. Logout ");


			String s = in.nextLine();
			switch (s) {
			case "1":
				System.out.println("Select item:");
				running = general.contin();		
				break;

			case "2":
				return;
				
			default:
				return;

			}
		}
		return;
		
	}

}
