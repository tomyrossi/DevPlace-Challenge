import java.util.*;
public class ChallengeAlgoritmosEj1
{
    public static void main(String[] args)
    {
        Scanner obtenerNumero = new Scanner(System.in);
        int contador=0;
        int numero;
        boolean esPrimo=true;
        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();
        
        //Divido el numero y si hay mas de 2 con resto 0 quiere decir que tiene mas 
        //de 2 divisores por lo tanto esPrimo toma el valor de false y deja de iterar.
        for(int i = 1; i <= numero && esPrimo ; i++){
            if((numero % i) == 0){
                contador++;
                if (contador>2) esPrimo=false;
            }
        }
        if (esPrimo){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}
