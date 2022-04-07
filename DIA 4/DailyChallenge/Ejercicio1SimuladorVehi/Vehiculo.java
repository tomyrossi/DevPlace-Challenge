package Ejercicio1SimuladorVehi;

public class Vehiculo {
	//Atributos
	protected int velocidad;
	protected String matricula;
	
	//Constructor
	public Vehiculo(String matricula) {
		this.matricula=matricula;
		this.velocidad=0;
	}
	
	//Metodos
	public void acelerar(int a) {
		velocidad+=a;
	}
	
	public String toString() {
		return "Matricula: "+matricula+" Velocidad: "+velocidad;
	}
	
}
