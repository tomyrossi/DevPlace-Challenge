package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Cliente;

public class ClientesDb {
	
	public void select() throws SQLException {
	  
		Conexion dbc = new Conexion();		
		if (dbc.getConnection() != null) {
			try {
				String query="SELECT * FROM Cliente";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				ResultSet rs = st.executeQuery(query);
				System.out.println("~~~~~~~~~~~LISTA DE CLIENTES~~~~~~~~~~~~~~");
      		   while (rs.next()) {
      			   System.out.println("Id: " + rs.getInt("idCliente")+ ",  Nombre: " + rs.getString("nombre") +", Apellido: " 
      					   + rs.getString("apellido") + " DNI: " + rs.getString("dni") + ", Direccion: " + rs.getString("direccion")
      					   +", Vendedor Id: " + rs.getInt("Vendedor_idVendedor"));
      		   }
      		   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n");
			}catch (Exception e) {
				System.out.println("ERROR AL MOSTRAR. \n" + e.getMessage().toString());
			}
		}
		
	}
	
	public void insertCLiente(Cliente c) throws SQLException {
		boolean insertado = false;
		Conexion dbc = new Conexion();		
		if (dbc.getConnection() != null) {
			try {
				String query="INSERT INTO Cliente (nombre, apellido, dni, direccion, fechaNacimiento, Vendedor_idVendedor) values(?,?,?,?,?,?)";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				st.setString(1, c.getNombre());
				st.setString(2, c.getApellido());
				st.setString(3, c.getDni());
				st.setString(4, c.getDireccion());
				st.setString(5, c.getFechaNacimiento());
				st.setInt(6, c.getIdVendedor());
				st.execute();
				insertado=true;
			}catch (Exception e) {
				System.out.println("ERROR AL INSERTAR. \n" + e.getMessage().toString());
			}
		}
		
	}
	
	public void deleteCliente(int id) throws SQLException {
		
		Conexion dbc = new Conexion();		
		
		if (dbc.getConnection() != null) {
			
			try {
				
				String query="DELETE FROM Cliente WHERE idCliente="+ id +";";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				st.execute();
				System.out.println("Cliente eliminado correctamente.");
				
			}catch (Exception e) {
				System.out.println("ERROR AL ELIMINAR. \n" + e.getMessage().toString());
			}
		}
		
	}
}
