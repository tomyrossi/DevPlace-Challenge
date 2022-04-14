package app;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
	
	public static void getMenu() throws SQLException {
		
		boolean flag=false;
		Scanner sc= new Scanner(System.in);
		while (!flag) {
			System.out.println("-----------MENU---------- \n \n" 
			+ "1) Clientes \n"
			+ "2) Vendedores \n"
			+ "3) Facturacion \n"
			+ "4) Productos \n"
			+ "0) Exit \n");
			System.out.print("Opcion= ");
			int opcion=sc.nextInt();
			switch(opcion){
			case 1: ClientesMenu.getMenu();
			break;
			case 2: VendedorMenu.getMenu();
			break;
			case 3: //Facturacion();
			break;
			case 4: //Productos();
			break;
			case 0: flag=true;
			break;
			default: System.out.println(" \n -No eligio una opcion valida- \n");
			}
		}
	}
}
