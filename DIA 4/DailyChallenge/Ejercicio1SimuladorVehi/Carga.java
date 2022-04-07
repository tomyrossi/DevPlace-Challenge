package Ejercicio1SimuladorVehi;

public class Carga extends Vehiculo{
	
	//Atributo
	
	private Remolque remolque;
	
	
	//Constructor
	public Carga(String m) {
		super(m);
		remolque=null;
	}
	
	//Metodo
	
	public void ponRemolque(Remolque r) {
		remolque=r;
	}
	
	public void quitaRemolque() {
		remolque=null;
	}
	
	public void acelerar(int km) {
		try{		if (remolque!=null && km+velocidad>100) {
				throw new DemasiadoRapidoException("Va demasiado rapido para acelerar tanto con remolque");
			}else {
				velocidad+=km;
			}
		}catch (DemasiadoRapidoException e) {};
			
		}
	
	public String toString() {
		if (remolque!=null) {
			return super.toString()+" Remolque: "+remolque.toString();
		}else {
			return super.toString();
		}
	}
	
}
