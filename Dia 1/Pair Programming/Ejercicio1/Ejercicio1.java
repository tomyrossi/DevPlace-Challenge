package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main (String [] args) {
		int opcion=1;
		int lado1,lado2;
		Scanner teclado = new Scanner(System.in);
		while(opcion!=0) {
			System.out.println("Ingrese la opcion de la figura que quiere calcular:");
			System.out.println("1) Cuadrado");
			System.out.println("2) Rectangulo");
			System.out.println("0) Salir");
			opcion = teclado.nextInt();
			switch(opcion) {
			case 1: {
				System.out.println("Ingrese el valor del lado del Cuadrado: ");
				lado1=teclado.nextInt();
				Cuadrado cuadrado1=new Cuadrado(lado1);
				System.out.println("El perimetro es= "+cuadrado1.perimetro());
				System.out.println("La superficie es= "+cuadrado1.superficie());
				break;
				}
			case 2: {
				System.out.print("Ingrese el valor del lado Mayor del Rectangulo: ");
				lado1=teclado.nextInt();
				System.out.print("Ingrese el valor del lado Menor del Rectangulo: ");
				lado2=teclado.nextInt();
				Rectangulo rectangulo1=new Rectangulo(lado1,lado2);
				System.out.println("El perimetro es= "+rectangulo1.perimetro());
				System.out.println("La superficie es= "+rectangulo1.superficie());
				break;
				}
			}
		}
	}
}
