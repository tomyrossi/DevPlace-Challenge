package database;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import models.Cliente;
import models.Facturacion;

public class FacturacionDb {
	public void select() throws SQLException {
		  
		Conexion dbc = new Conexion();		
		if (dbc.getConnection() != null) {
			try {
				String query="SELECT * FROM Facturacion";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				ResultSet rs = st.executeQuery(query);
				System.out.println("~~~~~~~~FACTURAS~~~~~~~~~~~");
      		   while (rs.next()) {
      			   System.out.println("Id: " + rs.getInt("idFacturacion")+ ",  Numero: " + rs.getInt("numero") +", Fecha Compra: " 
      					   + rs.getDate("fechaCompra") + " Id Vendedor: " + rs.getInt("Vendedor_idVendedor") + ", Id Cliente: " + rs.getInt("Cliente_idCliente"));
      		   }
      		   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n");
			}catch (Exception e) {
				System.out.println("ERROR AL MOSTRAR. \n" + e.getMessage().toString());
			}
		}
		
	}
	
	public void insertFactura(Facturacion f) throws SQLException {

		Conexion dbc = new Conexion();		
		if (dbc.getConnection() != null) {
			try {
				
				String query="INSERT INTO facturacion (numero, fechaCompra, Vendedor_idVendedor, Cliente_idCliente) values(?,CURDATE(),?,?)";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				st.setInt(1, f.getNumero());
				st.setInt(2, f.getIdVendedor());
				st.setInt(3, f.getIdComprador());
				st.execute();

			}catch (Exception e) {
				System.out.println("ERROR AL INSERTAR. \n" + e.getMessage().toString());
			}
		}
		
	}
	
	public void deleteFacturacion(int id) throws SQLException {
		
		Conexion dbc = new Conexion();		
		
		if (dbc.getConnection() != null) {
			
			try {
				
				String query="DELETE FROM facturacion WHERE idFacturacion="+ id +";";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				st.execute();
				System.out.println("Facturacion eliminada correctamente.");
				
			}catch (Exception e) {
				System.out.println("ERROR AL ELIMINAR. \n" + e.getMessage().toString());
			}
		}
		
	}
}

