package MasaCorporal;
import java.util.Scanner;
public class MasaCorporal {
	
	public static void main (String [] args) {
		float altura,peso;
		float indiceMC;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese su altura (en metros)= ");
		altura=teclado.nextFloat();
		System.out.print("Ingrese su peso= ");
		peso=teclado.nextFloat();
		indiceMC=peso / (altura*altura);
		System.out.println("Su IMC es igual a "+indiceMC);
		System.out.print("Diagnostico: ");
		if (indiceMC<20) System.out.println("Mal estado");
		else {
			if (indiceMC<22) System.out.println("Bajo de peso");
			else {
				if(indiceMC<25) System.out.println("Peso Normal");
				else {
					if (indiceMC<30) System.out.println("Sobrepeso");
					else {
						if (indiceMC<40) System.out.println("Sobrepeso cronico");
						else { 
							if (indiceMC>=40) System.out.println("Hospitalizado");}
					}
				}
			}
		}
		
	}
}
