package app;

import java.sql.SQLException;
import java.util.Scanner;

import database.VendedoresDb;
import models.Cliente;
import models.Vendedor;

public class VendedorMenu {
	
	private static VendedoresDb vdb= new VendedoresDb();
	
	public static void getMenu() throws SQLException {
		
		boolean flag=false;
		Scanner sc= new Scanner(System.in);
		
		while (!flag) {
			System.out.println("-----------VENDEDOR---------- \n \n" 
			+ "1) Select  \n"
			+ "2) Insert  \n"
			+ "3) Update  \n"
			+ "4) Delete  \n"
			+ "0) ATRAS \n");
			System.out.print("Opcion= ");
			int opcion=sc.nextInt();
			switch(opcion){
			case 1: vdb.select();
			break;
			case 2: insertar();
					flag=true;
			break;
			case 3: //  ();
			break;
			case 4: //  ();
			break;
			case 0: flag=true;
			break;
			default: System.out.println(" \n -No eligio una opcion valida- \n");
			}
		}
	}

	public static void insertar() throws SQLException {
		Scanner sc= new Scanner(System.in);
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
		Vendedor aux=new Vendedor(nombre, apellido, dni, direccion, salario,fechaNac);
		vdb.insertVendedor(aux);
	}
}