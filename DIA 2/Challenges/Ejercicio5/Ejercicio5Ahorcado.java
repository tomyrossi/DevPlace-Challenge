package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5Ahorcado {

	public static void main (String [] args) {
		Scanner teclado=new Scanner(System.in);
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		int turnos;
		
		System.out.print("Ingrese nomrbe Jugador 1= " );
		jugador1.setNombre(teclado.next());
		System.out.print("Ingrese nomrbe Jugador 2= " );
		jugador2.setNombre(teclado.next());
		System.out.println("");
		System.out.print("Ingrese cuantos turnos quiere jugar? = ");
		turnos = teclado.nextInt();
		
		for (int i=0; i<turnos;i++) {
			System.out.println("======================================");
			System.out.println("================TURNO "+(i+1)+"================");
			ingresoPalabras(jugador1,jugador2);
			turno(jugador1,jugador2);
			turno(jugador2,jugador1);
		}
		
		System.out.println("===============================================");
		System.out.print("Los puntos quedaron de la siguiente manera=");
		System.out.print(jugador1.getNombre()+"= "+jugador1.getpuntos()+" puntos");
		System.out.print(jugador2.getNombre()+"= "+jugador2.getpuntos()+" puntos");
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
		char letraIngresada;
		int cantAciertos=0;
		int posicionLetra;
		System.out.println("===============================================");
		System.out.println("Es el turno de adivinar de '"+adivinador.getNombre()+"'");
		System.out.println("(Recorda la pista es - "+rival.getPista()+"- )");
		while (intentos!=0 && !acierto) {
			System.out.print("Ingrese una letra= ");
			letraIngresada=sn.nextLine().charAt(0);
			posicionLetra=rival.estaLetra(letraIngresada);
			if (posicionLetra!=-1) {
				System.out.println("Muy bien! Esta esa letra... proba con una mas");
				cantAciertos++;
				rival.eliminarLetra(posicionLetra);
				if (cantAciertos==rival.cantLetrasPalabra()) {
					System.out.println("ACERTASTE !! Sumaste 1 pto ");
					acierto=true;
				}
			}else {
				intentos--;
				System.out.println("No esta esa letra... te quedan "+intentos+" intentos! ");
			}
		}
		if (intentos==0) System.out.println("Te quedaste sin intentos :( ");
		
	}
	
	/*private static boolean estaLetra(String palabra,char letra) {
		boolean esta= false;
		for (int i=0;i<palabra.length()&&!esta;i++) {
			if (letra==palabra.charAt(i)) {
				esta=true;
				palabra.replace(letra,"");				
			}
		}
		return esta;
	}*/
	
	
}


