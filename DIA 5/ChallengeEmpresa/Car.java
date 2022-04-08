package ChallengeEmpresa;

public class Car {
	private String matricula;
	private String marca;
	private String modelo;
	
	public Car(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Car [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
}
