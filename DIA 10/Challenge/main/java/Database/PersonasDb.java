package Database;

import java.net.URLConnection;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class PersonasDb {
	URLConnection url;
		Scanner sn=new Scanner(System.in);
		Conexion con;
		MongoDatabase mdb;
		MongoCollection <Document> personas;
		
		public PersonasDb(){
			con = new Conexion("Clase10");
			mdb = con.establecerConexion();
			personas = mdb.getCollection("Challenge");
		}
				
		public void registrarPersona(){
			String nombre;
			String apellido;
			String dni;
	        String direccion;
	       
	       System.out.println("Ingrese Nombre: ");
	       nombre=sn.next();
	       System.out.println("Ingrese Apellido: ");
	       apellido=sn.next();
	       System.out.println("Ingrese DNI: ");
	       dni=sn.next();
	       System.out.println("Ingrese Direccion: ");
	       direccion=sn.next();
			
	       if(!existe(dni)) {
	    	   personas.insertOne(new Document("Nombre", nombre).append("Apellido", apellido).append("DNI", dni).append("Direccion", direccion));
	    	   System.out.println("Se registro con exito!");
		   }else
			   System.out.println("Ya existe un registro con ese DNI");
		}
		
		public boolean existe(String dni){
			FindIterable<Document> personD = personas.find().filter(new Document("DNI", dni));
			return personD.first() != null;					
		}
		
		public void mostrarPersonas(){
			MongoCursor<Document> pIterator = personas.find().iterator();
			while(pIterator.hasNext()){
				System.out.println(pIterator.next().toJson());
			}
		}

		public void consultarPersona(String Dni){
			FindIterable<Document> personD = personas.find().filter(new Document("DNI", Dni));
			if(personD.first() != null)
				System.out.println(personD.first().toJson());
		}

		public void eliminarPersona(String Dni)	{
			if(existe(Dni)) {
				personas.deleteOne(new Document("DNI", Dni));
				System.out.println("Eliminado con exito!");
			}else
			System.out.println("No existen registros con ese DNI");
		}
}
