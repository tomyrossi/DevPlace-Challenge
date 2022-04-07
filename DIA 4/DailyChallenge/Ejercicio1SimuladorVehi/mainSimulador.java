package Ejercicio1SimuladorVehi;

public class mainSimulador {

		public static void main(String[]args) {
			Particular auto1 = new Particular("ABC-123",5);
			Particular auto2 = new Particular("XYZ-987",4);
			Carga camion1 = new Carga("QWER-1234");
			Carga camion2 = new Carga("asdf-9876");
			Remolque remolque1=new Remolque(1000);
			camion2.ponRemolque(remolque1);			
			mostrarInfo(auto1,auto2,camion1,camion2);
			System.out.println("----Aceleradas----");
			auto1.acelerar(120);
			System.out.println(auto1.toString());
			auto2.acelerar(90);
			System.out.println(auto2.toString());
			camion1.acelerar(120);
			System.out.println(camion1.toString());
			camion2.acelerar(120);
			System.out.println(camion2.toString());
			
		}
	
		private static void mostrarInfo(Vehiculo v1,Vehiculo v2,Vehiculo v3,Vehiculo v4){
			
			System.out.println("Vehiculo 1: "+v1.toString());
			System.out.println("Vehiculo 2: "+v2.toString());
			System.out.println("Vehiculo 3: "+v3.toString());
			System.out.println("Vehiculo 4: "+v4.toString());
			
		}
}
