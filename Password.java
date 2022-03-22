
import java.util.*;
import java.util.Random;

public class Password
{
    //Atributos
    private int longitud;
    private String contraseña;
    
    //Constructores
    public Password(){
        longitud = 8;
        contraseña=generarPassword();
    }
    public Password(int n){
        longitud=n;
        contraseña=generarPassword();
    }
    
    //Consultas
    public int getLongitud(){ return longitud;}
    public String getContraseña(){ return contraseña;}
    public void setLongitud(int n){ longitud = n;}
    public void setContraseña(String s){ 
        contraseña = s;
        longitud = s.length();
    }
    //Comandos
    
    //para que sea fuerte debe tener más de 2 mayúsculas, más de 1 minúscula y más de 3 números.
    public boolean esFuerte(){
        boolean fuerte=false;
        int mayu=0;
        int minu=0;
        int num=0;
        for(int i=0;i<contraseña.length();i++){
                         // El siguiente paso es juzgar
            if(contraseña.charAt(i)<='z'&&contraseña.charAt(i)>='a'){
                minu++;
            }
            else if(contraseña.charAt(i)>='A'&&contraseña.charAt(i)<='Z'){
                mayu++;
            }
            else if(contraseña.charAt(i)>='0'&&contraseña.charAt(i)<='9'){
                num++;
            }
        }
        return (mayu>2 && minu>1 && num>3);
    }
    
    public String generarPassword(){
        String nuevoPass = "";        
        Random aleatorio = new Random();
        String mayMinNum = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789";
              
        for (int i=0; i<longitud;i++){
            int numeroAleatorio = aleatorio.nextInt(mayMinNum.length());
            char randomChar = mayMinNum.charAt(numeroAleatorio);
            nuevoPass+= randomChar;
        }
        
        return nuevoPass;
    }
    
    
}
