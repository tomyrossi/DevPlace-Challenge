package EjemploPrimo;
import java.util.Scanner;

public class Primo {
	public static void main (String []args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese un numero de 1 a 14= ");
		numero = teclado.nextInt();
		
		if (esPrimoIf(numero)) System.out.println("El numero es PRIMO");
		else System.out.println("El numero NO ES PRIMO");
		
		if (esPrimoSwitch(numero)) System.out.println("El numero es PRIMO");
		else System.out.println("El numero NO ES PRIMO");
		
	}
	
	private static boolean esPrimoIf(int n) {
		boolean es=false;
		if ((n==2)||(n==3)||(n==5)||(n==7)||(n==11)||(n==13)) {
			es=true;
		}
		return es;
	}
	
	private static boolean esPrimoSwitch(int n) {
		boolean es=false;
		switch(n) {
			case 2:
			case 3:
			case 5:
			case 7:
			case 11:
			case 13: es=true;
		}
		return es;
	}
}
