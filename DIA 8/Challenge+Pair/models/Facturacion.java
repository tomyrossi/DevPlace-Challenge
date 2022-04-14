package models;

import java.util.ArrayList;

public class Facturacion {

		private int numero;
		private String fecha;
		private int idVendedor;
		private int idComprador;
		private ArrayList<Producto>productos;
		
		public Facturacion(int numero, String fecha) {
			super();
			this.numero = numero;
			this.fecha = fecha;
		}

		public ArrayList<Producto> getProductos() {
			return productos;
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
