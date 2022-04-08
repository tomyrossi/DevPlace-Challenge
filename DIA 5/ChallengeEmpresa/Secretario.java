package ChallengeEmpresa;

public class Secretario extends Miembro{
	
	//Atributos
	protected boolean despacho;
	protected String fax;
	protected final double aumento=antiguedad*(0.05);
	
	public Secretario(String nombre, String apellido, String dni, String direccion, String telefono, double salario,
			boolean despacho, String fax) {
		super(nombre, apellido, dni, direccion, telefono, salario);
		this.despacho=despacho;
		this.fax=fax;
	}

	@Override
	public String toString() {
		return "Secretario [nombre=" + nombre+ ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion + ", antiguedad=" + antiguedad
				+ ", telefono=" + telefono + ", salario=" + salario + ", despacho=" + despacho + ", fax=" + fax + ", aumento=" + aumento + "]";
		
	}

	public boolean isDespacho() {
		return despacho;
	}

	public void setDespacho(boolean despacho) {
		this.despacho = despacho;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public void setSalario(double salario) {
		this.salario = salario+(salario*aumento);
	}
	
}
