package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4Paises {
	
	public static void main (String []args) {
		
		String [][] paises;
		
		Scanner teclado= new Scanner(System.in);
		int cant=0;
		paises=new String [3][4];
		
		System.out.println("Ingresa los paises");
		
		while (cant<3) {
			System.out.print("Pais "+(cant+1)+"= ");
			paises[cant][0]=teclado.nextLine();
			cant++;
		}
		
		cant=0;
		System.out.println("Ingresa las ciudades");
		while(cant<3) {
			System.out.println(paises[cant][0]);
			for(int i=1;i<4;i++) {
				System.out.print(" Ciudad "+ i +"= ");
				paises[cant][i]=teclado.nextLine();
			}
			cant++;
		}
		
		System.out.println("");
		System.out.println("=El arreglo quedo de la siguiente manera=");
		mostrarArreglo(paises);
	}
	
	private static void mostrarArreglo (String [][] a) {
		for (int f=0; f<a.length;f++) {
			for (int c=0; c<a[0].length;c++) {
				System.out.print( a[f][c] + " ");
			}
			System.out.println(" ");
		}
	}
}
