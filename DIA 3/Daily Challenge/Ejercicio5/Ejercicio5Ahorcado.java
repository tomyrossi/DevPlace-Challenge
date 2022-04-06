package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5Ahorcado {

	public static void main (String [] args) {
		Scanner teclado=new Scanner(System.in);
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		int turnos;
		boolean flag=false;
		
		System.out.print("Ingrese nomrbe Jugador 1= " );
		jugador1.setNombre(teclado.next());
		System.out.print("Ingrese nomrbe Jugador 2= " );
		jugador2.setNombre(teclado.next());
		System.out.println("");
		
		
		while (!flag) {
			System.out.println("======================================");
			System.out.println("");
			ingresoPalabras(jugador1,jugador2);
			turno(jugador1,jugador2);
			if (jugador1.getpuntos()==3) flag=true;
			else {
				turno(jugador2,jugador1);
				if ( jugador2.getpuntos() == 3) flag=true;
			}
		}
		if (jugador1.getpuntos() ==3 ) {
			System.out.println("===============================================");
			System.out.println("=====EL GANADOR ES "+jugador1.getNombre()+"=======");
		}else {
			System.out.println("===============================================");
			System.out.println("=====EL GANADOR ES "+jugador2.getNombre()+"=======");
		}
		System.out.println("===============================================");
		System.out.println("Los puntos quedaron de la siguiente manera=");
		System.out.println(jugador1.getNombre()+"= "+jugador1.getpuntos()+" puntos");
		System.out.println(jugador2.getNombre()+"= "+jugador2.getpuntos()+" puntos");
		System.out.println("===============================================");
	}
	
	private static void ingresoPalabras(Jugador j1, Jugador j2) {
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Ingrese palabra del Jugador 1= " );
		j1.setPalabra(teclado.next());
		System.out.println("Ingrese pista= " );
		j1.setPista(teclado.next());
		System.out.println("--------------------");
		System.out.println("Ingrese palabra del Jugador 2= " );
		j2.setPalabra(teclado.next());
		System.out.println("Ingrese pista= " );
		j2.setPista(teclado.next());
		

	}
	
	private static void turno(Jugador adivinador, Jugador rival) {
		Scanner sn=new Scanner(System.in);
		int intentos=6;
		boolean acierto=false;
		char [] ingresoLetras = new char[rival.cantLetrasPalabra()];
		char letraIngresada;
		int cantAciertos=0;
		int posicionLetra;
		
		System.out.println("===============================================");
		System.out.println("Es el turno de adivinar de '"+adivinador.getNombre()+"'");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("(Recorda la pista es - "+rival.getPista()+"- )");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		while (intentos!=0 && !acierto) {
			mostrarArray(ingresoLetras);
			System.out.print("Ingrese una letra= ");
			letraIngresada=sn.next().charAt(0);
			posicionLetra=rival.getPosicionLetra(letraIngresada);
			if (posicionLetra>-1) {
				rival.eliminarLetra(posicionLetra);
				System.out.println(" BIEN - Esta en la posicion "+(posicionLetra + 1));
				cantAciertos++;
				ingresoLetras[posicionLetra]=letraIngresada;
				if (cantAciertos==rival.cantLetrasPalabra()) {
					System.out.println("//////////////////////////////////////");
					System.out.println("/// ACERTASTE - "+adivinador.getNombre()+" suma 1 pto ");
					System.out.println("/////////////////////////////////////");
					adivinador.sumarPunto();
					acierto=true;
				}
			}else {
				intentos--;
				System.out.println("NO ESTA - te quedan "+intentos+" intentos! ");
			}
		}
		if (intentos==0) System.out.println("Te quedaste sin intentos :( ");
		
	}
	
	private static void mostrarArray(char [] a) {
		System.out.print("/Intentos/==> ");
		for (int i=0;i<a.length;i++) {
			if ( a[i]==' ') {
				System.out.print(" _ ");
			}else {
				System.out.print(" "+a[i]+" ");
			}
		}
		System.out.println("");
	}
	
	
}


