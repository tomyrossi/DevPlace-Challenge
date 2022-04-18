package app;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import database.VendedoresDb;
import models.Cliente;
import models.Vendedor;

public class VendedorMenu {
	
	private static VendedoresDb vdb= new VendedoresDb();
	private static 	Scanner sc= new Scanner(System.in);
	
	public static void getMenu() throws SQLException {
		
		boolean flag=false;
		
		while (!flag) {
			System.out.println("-----------VENDEDOR---------- \n \n" 
			+ "1) Mostrar Lista  \n"
			+ "2) Insert  \n"
			+ "3) Update  \n"
			+ "4) Delete  \n"
			+ "0) ATRAS \n");
			System.out.print("Opcion= ");
			int opcion=sc.nextInt();
			switch(opcion){
			case 1: 
				vdb.select();
				flag=true;
				break;
			case 2: 
				insertar();
				flag=true;
				break;
			case 3: //  ();
				break;
			case 4:
				delete();
				flag=true;
				break; 
			case 0: flag=true;
			break;
			default: System.out.println(" \n -No eligio una opcion valida- \n");
			}
		}
	}

	public static void insertar() throws SQLException {
		try {
			
			System.out.println("Ingrese nombre: ");
			String nombre=sc.next();
			System.out.println("Ingrese apellido: ");
			String apellido=sc.next();
			System.out.println("Ingrese dni: ");
			String dni=sc.next();
			System.out.println("Ingrese direccion: ");
			String direccion=sc.next();
			System.out.println("Ingrese salario: ");
			Double salario=sc.nextDouble();
			System.out.println("Ingrese Fecha de Nacimiento (YYYY-MM-DD): ");
			String fechaNac=sc.next();
			while(!validarFecha(fechaNac)) {
				System.out.println("Fecha incorrecta, vuelva a ingresar la fecha (YYYY-MM-DD): ");
				fechaNac=sc.next();
			}
			Vendedor aux=new Vendedor(nombre, apellido, dni, direccion, salario,fechaNac);
			vdb.insertVendedor(aux);
			
		}catch (Exception e) {
			System.out.println("Error al ingresar datos");
		}
	}
	
	public static void delete() throws SQLException {
		vdb.select();
		System.out.println("Ingrese ID que quiera eliminar: : ");
		int id=sc.nextInt();
		vdb.deleteVendedor(id);
	}
	
	public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
}