package ChallengeAcademia;

public class Profesor extends Empleado{

		//Atributos
	protected String departamento;
	
	public Profesor(String nombre,String apellido,int nroId,String estadoCivil, int nroDespacho,int añoIncorporacion, String departamento) {
		super(nombre,apellido,nroId,estadoCivil,nroDespacho,añoIncorporacion);
		this.departamento=departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", nroId=" + nroId + ", estadoCivil="
				+ estadoCivil + ", añoIncorporacion=" + añoIncorporacion + ", nroDespacho=" + nroDespacho
				+ ", departamento=" + departamento + "]";
	}

}
