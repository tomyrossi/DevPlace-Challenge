package ChallengeAcademia;

public abstract class Persona {

	//Atributos
	protected String nombre;
	protected String apellido;
	protected int nroId;
	protected String estadoCivil;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNroId() {
		return nroId;
	}
	public void setNroId(int nroId) {
		this.nroId = nroId;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
}
