package ChallengeAcademia;

public class Estudiante extends Persona{

	//Atributos
	protected String curso;
	
	public Estudiante(String nombre,String apellido,int nroId,String estadoCivil,String curso) {
		super(nombre,apellido,nroId,estadoCivil);
		this.curso=curso;
	}
	
	public void matriculacion(String cursoNuevo) {
		curso=cursoNuevo;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", nroId=" + nroId + ", estadoCivil="
				+ estadoCivil + ", curso=" + curso + "]";
	}
	
	
}
