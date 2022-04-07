package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5Ahorcado {

	public static void main (String [] args) {
		
		Scanner teclado=new Scanner(System.in);
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		
		
		System.out.print("Ingrese nomrbe Jugador 1= " );
		jugador1.setNombre(teclado.next());
		System.out.print("Ingrese nomrbe Jugador 2= " );
		jugador2.setNombre(teclado.next());
		System.out.println("");
		
		Ahorcado juego = new Ahorcado(jugador1,jugador2);
		juego.jugar();	
		
 }
}


