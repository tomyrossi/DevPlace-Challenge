package com.workshop.challenge1112.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBase {
	private static final String url="jdbc:mysql://localhost:3306/mydb";
	private static final String user="root";
	private static final String pass="1234";
	private Connection con;
	
	public DataBase() {
		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return con;
	}
	
}
