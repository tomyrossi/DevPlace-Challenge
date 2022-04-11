package ChallengeAcademia;

public abstract class Persona {

	//Atributos
	protected String nombre;
	protected String apellido;
	protected int nroId;
	protected String estadoCivil;
	
	
	public Persona(String nombre, String apellido, int nroId, String estadoCivil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroId = nroId;
		this.estadoCivil = estadoCivil;
	}
	
	public String getNombre() {
		return nombre;
	}
		public String getApellido() {
		return apellido;
	}
	public int getNroId() {
		return nroId;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public abstract String toString();
	
	
}
