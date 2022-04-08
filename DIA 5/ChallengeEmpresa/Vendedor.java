package ChallengeEmpresa;

import java.util.ArrayList;

public class Vendedor extends Miembro{

	
	//Atributos
	protected Car auto;
	protected String celular;
	protected String areaVenta;
	protected ArrayList<String>listaClientes;
	protected final double aumento=antiguedad*(0.05);
	
	public Vendedor(String nombre, String apellido, String dni, String direccion, String telefono, double salario,
			Car auto, String celular, String areaVenta) {
		super(nombre, apellido, dni, direccion, telefono, salario);
		this.auto=auto;
		this.celular=celular;
		this.areaVenta=areaVenta;
	}

	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion
				+ ", antiguedad=" + antiguedad + ", telefono=" + telefono + ", salario=" + salario + ", auto=" + auto.toString()
				+ ", celular=" + celular + ", areaVenta=" + areaVenta + ", listaClientes=" + listaClientes.toString()
				+ ", aumento(anual)=" + aumento + "]";
	}
	

	public void darAltaCliente(String cliente) {
		listaClientes.add(cliente);
		listaClientes.sort(null);
	}
	
	public void darBajaCliente(String cliente) {
		listaClientes.remove(cliente);
		listaClientes.sort(null);
	}
	


	public void setAuto(Car auto) {
		this.auto = auto;
	}

	public Car getAuto() {
		return auto;
	}

	public String getCelular() {
		return celular;
	}

	public String getAreaVenta() {
		return areaVenta;
	}

	public ArrayList<String> getListaClientes() {
		return listaClientes;
	}

	public double getAumento() {
		return aumento;
	}
	
	public void setSalario(double salario) {
		this.salario = salario+(salario*aumento);
	}
	
}
