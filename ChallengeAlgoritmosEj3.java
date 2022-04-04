
import java.util.*;

public class ChallengeAlgoritmosEj3
{
    public static void main (String [] args){
        float valorHora;
        String nombre;
        int antiguedad;
        float cantHorasMes;
        float importe;
        
        Scanner obtenerDato = new Scanner(System.in);
        Scanner obtenerNombre = new Scanner(System.in);
        
        System.out.println("<A continuacion solicitare distintos datos del empleado>");
        
        //Pido el valor de la hora del empleado
        System.out.print("Valor hora: ");
        valorHora = obtenerDato.nextFloat();
        //Solicito nombre
        System.out.println("Nombre: ");       
        nombre = obtenerNombre.nextLine();
        System.out.print("Obtener Antiguedad: ");
        antiguedad = obtenerDato.nextInt();
        System.out.print("Obtener Cant Horas Mes: ");
        cantHorasMes = obtenerDato.nextFloat();
        
        importe=cantHorasMes * valorHora;
        if (antiguedad >10) importe+=(antiguedad*30);
        
        System.out.println("Nombre: "+nombre+" / Antiguedad: "+antiguedad+
        " Años / Importe a Cobrar: $"+importe);
        
    }
}
