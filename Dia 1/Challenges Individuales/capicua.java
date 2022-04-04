package capicua;

import java.util.Scanner;

public class capicua {
	
	public static void main (String [] args) {
		
		int numero;
		int aux, inverso, digito;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		numero=teclado.nextInt();
		inverso = 0;
        aux = numero;
	    while (aux!=0){
	    	digito = aux % 10;
	        inverso = inverso * 10 + digito;
	        aux = aux / 10;
	    }
	    if(numero == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }	
	}
}
