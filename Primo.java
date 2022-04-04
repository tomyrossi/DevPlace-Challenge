package EjemploPrimo;
import java.util.Scanner;

public class Primo {
	public static void main (String []args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese un numero de 1 a 14= ");
		numero = teclado.nextInt();
		
		if (esPrimo(numero)) System.out.println("El numero es PRIMO");
		else System.out.println("El numero NO ES PRIMO");
		
	}
	
	private static boolean esPrimo(int n) {
		boolean es=false;
		if ((n==2)||(n==3)||(n==5)||(n==7)||(n==11)||(n==13)) {
			es=true;
		}
		return es;
	}
}
