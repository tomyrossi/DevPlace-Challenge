package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
	 Connection conn=null;
	
	public Conection() {
		
	 String url="jdbc:mysql://localhost:3306/db_clase7";
	 String user = "root";
	 String password = "root";
	
		try {
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("conexion exitosa");
		} catch (SQLException e) {
			System.out.println("error al conectar");
		}
	}
	
	public Connection getConnection()
	{
		return conn;
	}
}
