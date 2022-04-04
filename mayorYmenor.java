package MayorYMenor;

import java.util.Scanner;

public class mayorYmenor {

	public static void main (String [] args) {
		int n1,n2,n3;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Ingrese el 1er numero: ");
		n1=teclado.nextInt();
		System.out.print("Ingrese el 2do numero: ");
		n2=teclado.nextInt();
		System.out.print("Ingrese el 3er numero: ");
		n3=teclado.nextInt();
		
		if (n1>n2) {
			if (n1>n3) System.out.println("El MAYOR numero es el 1ero= "+n1);
			else System.out.println("El MAYOR numero es el 3ero= "+n3);
		}else {
			if (n2>n3) System.out.println("El MAYOR numero es el 2do= "+n2);
			else System.out.println("El MAYOR numero es el 3ero= "+n3);
		}
		
		if (n1<n2) {
			if (n1<n3) System.out.println("El MENOR numero es el 1ero= "+n1);
			else System.out.println("El MENOR numero es el 3ero= "+n3);
		}else {
			if (n2<n3) System.out.println("El MENOR numero es el 2do= "+n2);
			else System.out.println("El MENOR numero es el 3ero= "+n3);
		}
	}
}
