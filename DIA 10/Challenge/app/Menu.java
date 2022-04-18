package mongoConector.dia10;

import java.util.Scanner;

import Database.PersonasDb;

public class Menu {

	private static Scanner sn = new Scanner(System.in);
			
	public static void getMenu() {
		int opcion;
		PersonasDb pdb = new PersonasDb();
		String dni;
		
		try{
			
			do {
				System.out.println("------MENU------ \n"
						+"1) Registrar Datos \n"
						+ "2) Consultar Datos \n"
						+ "3) Eliminar Datos \n"
						+ "4) Listado General \n"
						+ "0) SALIR \n "
						+ "\n");
				System.out.print("Opcion= ");
				opcion = sn.nextInt();
				
				switch(opcion) {
				case 1: 
					pdb.registrarPersona();
					break;
				case 2:
					System.out.println("Ingrese DNI: ");
					dni=sn.next();
					pdb.consultarPersona(dni);
					break;
				case 3:
					System.out.println("Ingrese DNI: ");
					dni=sn.next();
					pdb.eliminarPersona(dni);;
					break;
				case 4:
					pdb.mostrarPersonas();
					break;
				case 0:
					System.out.println("Adios !");
					break;
				default: 
					System.out.println("Opcion incorrecta");
					break;
				}
				
			}while(opcion!=0);
			
		}catch(Exception e) {
			System.out.println("ERROR AL INGRESAR OPCION");
		}
		
	
	}
	
	
	
}
