package ChallengeEmpresa;

import java.util.ArrayList;

public class JefeZona extends Miembro{

	//Atributos
	private boolean despacho;
	private Secretario secretario;
	private ArrayList<Vendedor>ListaVendedores;
	private Car auto;
	protected final double aumento=antiguedad*(0.2);
	
	//Constructor
	public JefeZona(String nombre, String apellido, String dni, String direccion, String telefono, 
			double salario, boolean despacho,Secretario secretario,Car auto) {
		super(nombre, apellido, dni, direccion, telefono, salario);
		this.despacho=despacho;
		this.secretario=secretario;
		this.auto=auto;
	}

	@Override
	public String toString() {
		return "JefeZona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion
				+ ", antiguedad=" + antiguedad + ", telefono=" + telefono + ", salario=" + salario + ", despacho="
				+ despacho + ", secretario=" + secretario + ", ListaVendedores=" + ListaVendedores.toString() + ", auto=" + auto.toString()
				+ ", aumento (Anual)=" + aumento + "]";
	}

	public Secretario getSecretario() {
		return secretario;
	}

	public void setSecretario(Secretario secretario) {
		this.secretario = secretario;
	}

	public Car getAuto() {
		return auto;
	}

	public void setAuto(Car auto) {
		this.auto = auto;
	}

	public boolean isDespacho() {
		return despacho;
	}

	public ArrayList<Vendedor> getListaVendedores() {
		return ListaVendedores;
	}

	public double getAumento() {
		return aumento;
	}
	
	
	public void setSalario(double salario) {
		this.salario = salario+(salario*aumento);
	}	
	
	
	
	
}
