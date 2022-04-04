
import java.util.*;

public class ConsolaPass
{
    public static void main (String [] args){
        //Solicito se ingrese una nueva contraseña
        Scanner ingreso = new Scanner (System.in);
        System.out.print("Ingrese una contraseña:  ");
        String passIngresado = ingreso.nextLine();
        
        //Creo un obketo Password y le seteo la contraseña que se ingreso
        Password nuevoPass= new Password();
        nuevoPass.setContraseña(passIngresado);
        
        //Controlo si es Fuerte la contraseña ingresada
        System.out.println("El password quedo: "+nuevoPass.getContraseña());
        if (nuevoPass.esFuerte()) {
                System.out.println("El nuevo PASS es FUERTE");
            }else{
                System.out.println("El nuevo PASS es DEBIL");
            }      
        
        //Pruebo el constructor introduciendo la longitud de la contraseña y que se genere un a contraseña aleatoria de esa longitud
        System.out.println("--------------------------------------------------------");
        System.out.println("Testeo de constructor + generar contraseña aleatoria ");
        Password nuevoPass2= new Password(10);
        System.out.println("El password quedo: "+nuevoPass2.getContraseña());
        
        //Controla si la nueva contraseña aleatoria es Fuerte
        if (nuevoPass2.esFuerte()) {
                System.out.println("El nuevo PASS es FUERTE");
            }else{
                System.out.println("El nuevo PASS es DEBIL");
            }
        System.out.print("");
    }
}
