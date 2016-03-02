package nbgdb;

import java.util.*;
import com.mongodb.*;


public class MongoConnector {

	@SuppressWarnings({"resource", "unused", "deprecation" })
	public static void mongoConnector() {
		
//	    Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
//	    mongoLogger.setLevel(Level.SEVERE); 
		
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB db = mongoClient.getDB("nbgdb");
		System.out.println("Connect to database successfully");
		
//		DBCollection coll = db.createCollection("testing");
//		System.out.println("Collection created successfully");
		
	}
	
	public static void mongoDisconnect() {
		
		
		
	}

}
