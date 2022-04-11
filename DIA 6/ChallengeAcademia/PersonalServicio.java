package ChallengeAcademia;

public class PersonalServicio extends Empleado{

	//Atributo
	protected String seccion;

	public PersonalServicio(String nombre,String apellido,int nroId,String estadoCivil,int a�oIncorporacion, int nroDespacho, String seccion) {
		super(nombre,apellido,nroId,estadoCivil,nroDespacho,a�oIncorporacion);
		this.seccion = seccion;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return "PersonalServicio [nombre=" + nombre + ", apellido=" + apellido + ", nroId=" + nroId + ", estadoCivil="
				+ estadoCivil + ", a�oIncorporacion=" + a�oIncorporacion + ", nroDespacho=" + nroDespacho + ", seccion="
				+ seccion + "]";
	}
	
	
}
