package PairEjercicio1;

public class Moto extends Vehiculo{
	
	private String patente;
	private final float costoHora=50;
	
	public Moto(String patente) {
		this.patente=patente;
		
	}
	
	public String getPatente() {
		return patente;
	}
	public float importe(int minutos) {
		return costoHora*(minutos/ (float)60);
	}
}