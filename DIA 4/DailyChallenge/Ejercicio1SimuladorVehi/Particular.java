package Ejercicio1SimuladorVehi;

public class Particular extends Vehiculo{
	
	//atributos
	private int cantPuertas;
	
	public Particular(String m,int p) {
		super(m);
		cantPuertas=p;
	}
	
	public int getCantPuertas() {
		return cantPuertas;
	}
	
}
