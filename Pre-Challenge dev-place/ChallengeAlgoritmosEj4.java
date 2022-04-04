import java.util.*;
import java.util.Random;

public class ChallengeAlgoritmosEj4
{
    public static void main (String [] args){
        boolean adivino=false;
        int aleatorio;
        int numeroIngresado;
        
        //Creo un objeto de clase Random y busco un numero random entre 0 y 1000 y se lo pongo a la variable Aleatorio
        Random random = new Random ();
        aleatorio = random.nextInt(1000);
        Scanner obtenerNumero = new Scanner(System.in);
        
        while (!adivino){
            System.out.print("Adivine el numero elegido por el ordenador (Entre 0 y 1000): ");
            numeroIngresado = obtenerNumero.nextInt();
            if (numeroIngresado==aleatorio){
                System.out.println("ADIVINASTE !");
                adivino=true;
            }else{
                if (numeroIngresado<aleatorio){
                    System.out.println("Es MAYOR a ese... volve a intentar");
                }else{
                    System.out.println("Es MENOR a ese... volve a intentar");
                }
            }
        }
    }
}
