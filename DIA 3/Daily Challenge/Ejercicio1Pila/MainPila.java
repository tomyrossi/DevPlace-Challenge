package Ejercicio1Pila;

import java.util.Scanner;

public class MainPila {
	
	public static void main(String[] args) {
	
		Pila pila = new Pila(10);
		Scanner teclado= new Scanner(System.in);
		
		
		while(!pila.full()) {
			System.out.println("Ingresa un elemento a la pila");
			pila.push(teclado.nextInt());
		}
		
		System.out.print("Elementos de la pila: ");
		
		while(!pila.empty()) {
			System.out.print(pila.pop()+"|");
		}
	}
}