import java.util.*;

public class ChallengeAlgoritmosEj5
{
    public static void main (String [] args){
        int sumaTotal=0;
        int mayor=0;
        int menor=0;
        int numeroIngresado;
        
        Scanner obtenerNumero = new Scanner (System.in);
        System.out.println ("Ingrese repetidamente numeros (el programa terminara cuando ingrese -1)= ");
        numeroIngresado = obtenerNumero.nextInt();
        if (numeroIngresado!=-1){
            sumaTotal= numeroIngresado; 
            mayor=numeroIngresado;
            menor=numeroIngresado;
            
            numeroIngresado = obtenerNumero.nextInt();
            while (numeroIngresado!=-1){
                if (numeroIngresado>mayor) mayor=numeroIngresado;
                else if (numeroIngresado<menor) menor=numeroIngresado;
                sumaTotal+=numeroIngresado;
                numeroIngresado = obtenerNumero.nextInt();
            }
        }
        
        System.out.println ("a. "+mayor+" - Mayor numero Ingresado");
        System.out.println ("b. "+menor+" - Menor numero Ingresado");
        System.out.println ("c. "+ (sumaTotal - 1) +" - Suma de todos los numeros (Incluido el -1 final)");
        System.out.println ("d. "+ sumaTotal +" - Suma de los numeros");
        
    }
}
