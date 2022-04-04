package Notas;
import java.util.Scanner;

public class Notas {
	public static void main (String []args) {
		float nota1,nota2,nota3;
		float promedio;
		Scanner teclado= new Scanner(System.in);
		System.out.print("Ingrese la 1er nota= ");
		nota1=teclado.nextFloat();
		System.out.print("Ingrese la 2da nota= ");
		nota2=teclado.nextFloat();
		System.out.print("Ingrese la 3era nota= ");
		nota3=teclado.nextFloat();
		promedio= (nota1+nota2+nota3) / 3;
		if (promedio < 10) System.out.println("Resprobado");
		else {
			if (promedio <15) System.out.println("Aprobado");
			else {
				if (promedio >=15) System.out.println("Eximido");
			}
		}
	}
		
}
