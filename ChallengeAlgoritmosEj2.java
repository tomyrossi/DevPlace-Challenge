import java.util.*;

public class ChallengeAlgoritmosEj2
{
    public static void main(String [] args){
        String contraseña;
        String contraseñaNueva;
        boolean igual=false;
        Scanner obtenerContraseña = new Scanner(System.in);
        
        System.out.print("Ingresa una contraseña: ");
        contraseña = obtenerContraseña.nextLine();
        
        System.out.print("Ingresa nuevamente la contraseña: ");
        
        
        //Comparar si son iguales, dejar de hacerlo si van 3 veces o si son iguales
        for (int i=0; i<3 && !igual; i++){
            contraseñaNueva = obtenerContraseña.nextLine();
            if (contraseña.equals(contraseñaNueva)){
                igual=true;
                System.out.println("Felicitaciones,recordás tu contraseña");
            }else{
                System.out.print("Ingresa nuevamente la contraseña: ");
            }
        }
        if (!igual) System.out.println("Tenes que ejercitar la memoria");
    }
}
