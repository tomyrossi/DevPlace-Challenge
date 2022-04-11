package ChallengeAcademia;

public class PersonalServicio extends Empleado{

	//Atributo
	protected String seccion;

	public PersonalServicio(String nombre,String apellido,int nroId,String estadoCivil,int añoIncorporacion, int nroDepacho, String seccion) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.nroId=nroId;
		this.estadoCivil=estadoCivil;
		this.nroDespacho=nroDepacho;
		this.añoIncorporacion=añoIncorporacion;
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
				+ estadoCivil + ", añoIncorporacion=" + añoIncorporacion + ", nroDespacho=" + nroDespacho + ", seccion="
				+ seccion + "]";
	}
	
	
}
