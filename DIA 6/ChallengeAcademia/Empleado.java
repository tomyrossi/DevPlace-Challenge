package ChallengeAcademia;

public abstract class Empleado extends Persona {

		//Atributos
	protected int nroDespacho;
	protected int a�oIncorporacion;
	
	public Empleado(String nombre,String apellido,int nroId,String estadoCivil,int nroDespacho,int a�oIncorporacion) {
		super(nombre,apellido,nroId,estadoCivil);
		this.a�oIncorporacion=a�oIncorporacion;
		this.nroDespacho=nroDespacho;
	}
	
	public int getNroDespacho() {
		return nroDespacho;
	}
	public void setNroDespacho(int nroDespacho) {
		this.nroDespacho = nroDespacho;
	}
	
	public abstract String toString();
	
	
}
