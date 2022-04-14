package app;

import database.dbController;
import models.*;

public class Main {

	public static void main(String[] args) {

		dbController db = new dbController();	
		RecordCompany company;
		company = RecordCompany.getInstance();
		
		Artist art1 = new Artist("Justin", "Bieber", "123", "pop");
		Artist art2 = new Artist("Luis", "Mikel", "4123", "Rap");
		Artist art3 = new Artist("Ron", "Oswel", "234", "Rock");
		
		Album a1 = new Album("Never say never", art1);
		Album a2 = new Album("Hola", art2);
		Album a3 = new Album("Adios", art2);
		Album a4 = new Album("Live and go", art3);
		Album a5 = new Album("Ji o", art1);
		
		Song song1 = new Song("Baby", 3.10);
		Song song2 = new Song("Boyfriend", 2.10);
		Song song3 = new Song("Suggar", 2.40);
		Song song4 = new Song("bye", 3.10);
		Song song5 = new Song("hi", 2.60);
		Song song6 = new Song("high", 4.40);
		Song song7 = new Song("sky", 2.55);
		Song song8 = new Song("battle", 3.10);
		Song song9 = new Song("game", 2.15);
		
		
		a1.getSongs().addElement(song1);
		a1.getSongs().addElement(song2);
		a1.getSongs().addElement(song3);
		a2.getSongs().addElement(song4);
		a2.getSongs().addElement(song5);
		a3.getSongs().addElement(song6);
		a3.getSongs().addElement(song7);
		a4.getSongs().addElement(song8);
		a5.getSongs().addElement(song9);
		
		company.getAlbums().addElement(a1);
		company.getAlbums().addElement(a2);
		company.getAlbums().addElement(a3);
		company.getAlbums().addElement(a4);
		company.getAlbums().addElement(a5);
		
		for(int i = 0; i<company.getAlbums().getSize(); i++)
		db.insert((Album)company.getAlbums().getElement(i));
		
		Menu.menu(company);
		 
		

		
	}

}