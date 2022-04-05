package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1Calculadora {
	public static void main (String [] args) {
		
		float numero1,numero2,resultado;
		char operacion;
		Scanner teclado = new Scanner(System.in);
		resultado=0;
		
		System.out.println("=====CALCULADORA======");
		System.out.print("Ingrese el numero 1 = ");
		numero1=teclado.nextFloat();
		System.out.print("Ingrese el numero 2 = ");
		numero2=teclado.nextFloat();
		System.out.println("=========================");
		
		System.out.print("Ingrese la operacion que desea realizar (+, -, *, /): ");
		operacion=teclado.next().charAt(0);
		switch(operacion) {
		case '+' : {
			resultado=numero1+numero2;
			break;
		}
		case '-' : {
			resultado=numero1-numero2;
			break;
		}
		case '*' : {
			resultado=numero1*numero2;
			break;
		}
		case '/' : {
			resultado=numero1/numero2;
			break;
		}
		default : {
			System.out.println("No ingreso una operacion valida");
			break;
		}
		}
		System.out.print(numero1 + " " + operacion + " " + numero2 + " = " + resultado);
		
	}
}
