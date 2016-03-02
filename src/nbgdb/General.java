package nbgdb;

import java.util.Scanner;

public class General {
	
	static Scanner in = new Scanner(System.in);
	
	public int contin() {
		int x = 1;
		System.out.println("Would you like to continue? (1/0)");
		x = in.nextInt();
		return x;
	}
	
	public int logout() {
		DatabaseFace.USR = null;
		DatabaseFace.PWD = null;
		return 1;		
	}

}
