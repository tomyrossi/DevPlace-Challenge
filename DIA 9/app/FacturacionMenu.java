package app;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import database.ClientesDb;
import database.FacturacionDb;
import models.Cliente;
import models.Facturacion;

public class FacturacionMenu {
	
	private static FacturacionDb fdb= new FacturacionDb();
	private static Scanner sc= new Scanner(System.in);
	
	public static void getMenu() throws SQLException {
		
		boolean flag=false;
		while (!flag) {
			System.out.println("----FACTURACION---------- \n \n" 
			+ "1) Mostrar Lista  \n"
			+ "2) Insert  \n"
			+ "3) Update  \n"
			+ "4) Delete  \n"
			+ "0) ATRAS \n");
			System.out.print("Opcion= ");
			int opcion=sc.nextInt();
			switch(opcion){
			case 1: 
				fdb.select();
				flag=true;
				break;
			case 2: insertar();
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
			System.out.println("Ingrese Numero: ");
			int numero=sc.nextInt();
			System.out.println("Ingrese Id Vendedor: ");
			int idV=sc.nextInt();
			System.out.println("Ingrese Id Cliente: ");
			int idC=sc.nextInt();
			
			Facturacion aux=new Facturacion(numero, idV, idC);
			fdb.insertFactura(aux);
			
		}catch (NullPointerException e1) {
			System.out.println("ERROR AL INGRESAR DATOS. \n" );
		}catch (InputMismatchException e2) {
			System.out.println("ERROR AL INGRESAR DATOS. \n" );
		}
	}
	
	
	
	public static void delete() throws SQLException {
		fdb.select();
		System.out.println("Ingrese ID que quiere eliminar: ");
		int id = sc.nextInt();
		fdb.deleteFacturacion(id);
	}
	
	
	
}


