/*package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import models.Cliente;


public class dbController {
    
	private Conexion conection;
    private Connection con;
     
   
    public dbController(){
    	conection = new Conexion();
      
    }
    
    public void insertCliente(Cliente cliente){
        PreparedStatement ps;
        String sql;
        try{ //Guardar Cliente
        	
         	Connection con = conection.getConnection();
            sql = "insert into Cliente(nombre, apellido, dni, direccion) values (?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getDni());
            ps.setString(4, cliente.getDireccion());
            ps.executeUpdate();   
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        
    }
        
    public void selectArtist() {
        
        try{
           Connection con = conection.getConnection();
     	   String sql = "select id, nombre, apellido, dni, direccion from Cliente";
   		   PreparedStatement stmtt =  con.prepareStatement(sql);
   		   ResultSet rs = stmtt.executeQuery(sql);
   	
   		   while (rs.next()) {
   			   System.out.println("Cliente| Id: " + rs.getInt("ids")+ ", Nombre: " + rs.getString("nombre") + ", Apellido: " + rs.getString("apellido") + ", DNI: " + rs.getString("dni")+ ", Direccion: " + rs.getString("direccion") );
   		   }
   		  rs.close();
   		  stmtt.close();
   		}catch (Exception e) {
   		  e.printStackTrace();
   		}
    }

    
}*/