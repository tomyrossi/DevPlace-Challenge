package ChallengeEmpresa;

public class Empleado extends Miembro{

	//Atributos
	protected Miembro supervisor;
	
	
	//Constructor
	public Empleado (String nombre, String apellido,String dni,String direccion,String telefono,double salario) {
		super(nombre,apellido,dni,direccion,telefono,salario);
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion
				+ ", antiguedad=" + antiguedad + ", telefono=" + telefono + ", salario=" + salario + ", supervisor="
				+ supervisor + "]";
	}


	public Miembro getSupervisor() {
		return supervisor;
	}


	public void setSupervisor(Empleado supervisor) {
		this.supervisor = supervisor;
	}


}