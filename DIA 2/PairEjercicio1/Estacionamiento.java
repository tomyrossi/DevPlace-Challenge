package PairEjercicio1;

import java.util.Scanner;

public class Estacionamiento {

	public static void main (String []args) {
		
		Vehiculo [][] estacionamiento = new Vehiculo[3][3];
		Scanner sn= new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("Ingrese la opcion que desea realizar");
			System.out.println("1) Ingresar vehiculo");
			System.out.println("2) Egresar Vehiculo");
			System.out.println("0) Salir");
			System.out.print("opcion: ");
			opcion = sn.nextInt();
			
			switch (opcion) {
			case 1:
					ingresarVehiculo(estacionamiento);
					break;
			case 2: 
					System.out.println("El saldo a pagar es= "+egresarVehiculo(estacionamiento));
					break;
			}
		}while(opcion!=0);
		
	}
	
	private static void ingresarVehiculo(Vehiculo [][] v) {
		//Requiere que las posiciones x e y sean correctas
		Scanner sn= new Scanner(System.in);
		System.out.print("Tipo de Vehiculo (1.Auto / 2.Moto): ");
		int a = sn.nextInt();
		if (a==1) {
			System.out.print("Ingresar patente: ");
			String patente=sn.next();
			System.out.println("Ingresar coordenadas estacionamiento ");
			System.out.print("X= ");
			int x=sn.nextInt();
			System.out.print("Y= ");
			int y=sn.nextInt();
			v[x][y]=new Auto(patente);
		}else {
			if (a==2) {
				System.out.print("Ingresar patente: ");
				String patente=sn.next();
				System.out.println("Ingresar coordenadas estacionamiento ");
				System.out.print("X= ");
				int x=sn.nextInt();
				System.out.print("Y= ");
				int y=sn.nextInt();
				v[x][y]=new Moto(patente);
			}
		}
	}
	
	private static float egresarVehiculo(Vehiculo[][] v) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Coordenadas de estacionamiento ");
		System.out.print("X= ");
		int x=sn.nextInt();
		System.out.print("Y= ");
		int y=sn.nextInt();
		System.out.print("Ingresar tiempo en minutos= ");
		int tiempo=sn.nextInt();
		float importe= v[x][y].importe(tiempo);
		v[x][y]=null;
		return importe;
	}
	
	
}
