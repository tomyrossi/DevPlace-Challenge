package Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3Arreglo {
	public static void main (String [] args) {
		int numero;
		int [] arreglo = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		for (int pos=0; pos<arreglo.length;pos++) {
			System.out.print("Ingrese el valor de la posicion "+ pos +" =");
			numero=teclado.nextInt();
			arreglo[pos]=numero;
		}
		mostrarNumeroMayor(arreglo);
		mostrarNumeroMenor(arreglo);
		mostrarNumerosPares(arreglo);
		mostrarNumerosImpares(arreglo);
		ordenarAscendente(arreglo);
		
		
	}
	
	private static void mostrarNumeroMayor(int [] t) {
		int mayor=t[0];
		for (int p=0;p<t.length;p++) {
			if (t[p] > mayor) mayor=t[p];
		}
		System.out.println("# El numero MAYOR del arreglo es= "+mayor);
	}
	
	private static void mostrarNumeroMenor(int [] t) {
		int menor=t[0];
		for (int p=0;p<t.length;p++) {
			if (t[p] < menor) menor=t[p];
		}
		System.out.println("# El numero MENOR del arreglo es= "+menor);
	}
	private static void mostrarNumerosPares(int [] t) {
		System.out.println("NUMEROS PARES");
		for (int p=0;p<t.length;p++) {
			if (t[p]%2 == 0) System.out.print(t[p]);
		}	
		System.out.println("");
	}
	private static void mostrarNumerosImpares(int [] t) {
		System.out.println("NUMEROS IMPARES");
		for (int p=0;p<t.length;p++) {
			if (t[p]%2 != 0) System.out.print(t[p]);
		}	
		System.out.println("");
	}
	private static void ordenarAscendente(int [] t) {
		Arrays.sort(t);
		System.out.println("El arreglo ordenado de forma ascendiente queda asi=");
		for (int i=0;i<t.length;i++){
			System.out.print(t[i]);
		}
	}
	
	
}