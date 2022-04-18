package models;

import java.util.ArrayList;

public class Facturacion {

		private int numero;
		private String fecha;
		private int idVendedor;
		private int idComprador;
		private ArrayList<Producto>productos;
		
		public Facturacion(int numero,int idVendedor,int idComprador) {
			this.numero = numero;
			this.idVendedor=idVendedor;
			this.idComprador=idComprador;
		}

		public ArrayList<Producto> getProductos() {
			return productos;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}

		public void setProductos(ArrayList<Producto> productos) {
			this.productos = productos;
		}

		public void setProductos(Producto producto) {
			productos.add(producto);
		}

		public int getIdVendedor() {
			return idVendedor;
		}

		public void setIdVendedor(int idVendedor) {
			this.idVendedor = idVendedor;
		}

		public int getIdComprador() {
			return idComprador;
		}

		public void setIdComprador(int idComprador) {
			this.idComprador = idComprador;
		}
		
		
		
	}
