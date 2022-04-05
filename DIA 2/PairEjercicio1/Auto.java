package PairEjercicio1;

public class Auto extends Vehiculo{
	
	private String patente;
	private final float costoHora=100;
	
	public Auto(String patente) {
		this.patente=patente;
		
	}
	
	public String getPatente() {
		return patente;
	}
	
	public float importe(int minutos) {
		return costoHora*(minutos/(float)60);
	}
}
