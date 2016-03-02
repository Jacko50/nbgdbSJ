package nbgdb;

import java.util.*;

import org.omg.CORBA.portable.UnknownException;

import com.mongodb.*;

public class database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseFace databaseFace = new DatabaseFace();
		int x = 1;
		Scanner in = new Scanner(System.in);

		while ( x == 1 ) {
			System.out.println("Welcome to Dynabase! What would you like to do: \n"
					+ "1. Login \n"
					+ "2. Exit ");
			String scan = in.nextLine();

			switch ( scan ) {
			case "1":
				x = databaseFace.databaseFace();
				break;

			case "2":
				x = 0;
				break;

			default:
				System.out.println("Invalid option. \n"
						+ "please try again \n");
				break;
			}
		}

	}

}
