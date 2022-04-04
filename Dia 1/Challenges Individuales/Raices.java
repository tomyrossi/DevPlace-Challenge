package Raices;
import java.util.Scanner;

public class Raices {
	public static void main (String []args ) {
		int a,b,c;
		double discriminante;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese los valores de terminos de la ecuacion (aX^2 + bX + c)");
		System.out.print("a= ");
		a= teclado.nextInt();
		System.out.print("b= ");
		b= teclado.nextInt();
		System.out.print("c= ");
		c= teclado.nextInt();
		discriminante = (Math.pow(b, 2) - (4 * a * c));
		if (discriminante >= 0) {
			if (discriminante == 0) {
				System.out.println("Tiene 1 sola raiz");
				System.out.println("Raiz x1= "+(((-b) - (4 * a * c)) / (2 * a)));
			}else {
				System.out.println("Tiene 2 raices");
				System.out.println("Raiz x1= "+((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
				System.out.println("Raiz x1= "+((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
			}
		}else {
			System.out.println("No tiene raices reales");
		}
	}
}
