package Ejercicio1;

public class Cuadrado {
	//atributo
	public int lado;
		
	//Constructor
	public Cuadrado(int lado) {
		this.lado = lado;
	}
		
	public float perimetro() {
		return lado*4;
	}
		
	public float superficie() {
		return lado*lado;
	}
}
