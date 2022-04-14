package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Vendedor;

public class VendedoresDb {

	public void select() throws SQLException {
		  
		Conexion dbc = new Conexion();		
		if (dbc.getConnection() != null) {
			try {
				String query="SELECT * FROM Vendedor";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				ResultSet rs = st.executeQuery(query);
      		   while (rs.next()) {
      			   System.out.println("ID: "+rs.getInt("idVendedor")+" Nombre: " + rs.getString("nombre") +", Apellido: " 
      					   + rs.getString("apellido") + ", Dni: " + rs.getString("dni")+ "1, Direccion: " + rs.getString("direccion")
      					   +", Salario: " + rs.getDouble("salario") + ", Fecha Nacimiento: "+rs.getString("fechaNacimiento"));
      		   }
				
			}catch (Exception e) {
				System.out.println("ERROR AL MOSTRAR. \n" + e.getMessage().toString());
			}
		}
		
	}
	
	
	public void insertVendedor(Vendedor v) throws SQLException {
		boolean insertado = false;
		Conexion dbc = new Conexion();		
		if (dbc.getConnection() != null) {
			try {
				String query="INSERT INTO Vendedor (nombre, apellido,dni, direccion, salario, fechaNacimiento) values(?,?,?,?,?,?)";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				st.setString(1, v.getNombre());
				st.setString(2, v.getApellido());
				st.setString(3, v.getDni());
				st.setString(4, v.getDireccion());
				st.setDouble(5, v.getSalario());
				st.setString(6, v.getFechaNacimiento());
				st.execute();
				insertado=true;
			}catch (Exception e) {
				System.out.println("ERROR AL INSERTAR. \n" + e.getMessage().toString());
			}
		}
		
	}
}