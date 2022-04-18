package Database;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


public class Conexion {

		private String nombreDb;
		private  MongoClient mongoClient;
		private List<Document> database;
		
		public Conexion(String db){
			
		 mongoClient = MongoClients.create();
		 database = mongoClient.listDatabases().into(new ArrayList<Document>());
		 nombreDb = db;

		}

		public  MongoDatabase getDb()
		{
			return mongoClient.getDatabase(nombreDb);
		}
		
}
