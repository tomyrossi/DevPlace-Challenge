package Ejercicio2Recu;

import java.util.Scanner;

public class Recursividad {
	
	public static void main(String[] args) {
		
		Pila pila = new Pila(5);
		Scanner teclado = new Scanner(System.in);
		
		while(!pila.full()) {
			System.out.print("Ingresa elemento= ");
			pila.push(teclado.nextInt());
		}
		
		System.out.println("La suma de todos los elementos es= "+ sumaPila(pila));
		
	}
	
	public static int sumaPila(Pila pila) {
		int aux;
		if(pila.empty()) {
			return 0;
		} else {
			return pila.pop() + sumaPila(pila);
		}
	}
}
