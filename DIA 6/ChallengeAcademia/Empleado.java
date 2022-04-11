package ChallengeAcademia;

public abstract class Empleado extends Persona {

		//Atributos
	protected int nroDespacho;
	protected int añoIncorporacion;
	
	public Empleado(String nombre,String apellido,int nroId,String estadoCivil,int nroDespacho,int añoIncorporacion) {
		super(nombre,apellido,nroId,estadoCivil);
		this.añoIncorporacion=añoIncorporacion;
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
