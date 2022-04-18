package models;

public class Vendedor {

	private String nombre;
	private String apellido;
	private String direccion;
	private String dni;
	private double salario;
	private String fechaNacimiento;
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
	
	public Vendedor(String nombre, String apellido, String dni, String direccion, double salario,
			String fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni=dni;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
	}

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
