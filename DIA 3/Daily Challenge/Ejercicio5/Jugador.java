package Ejercicio5;

public class Jugador {
	
	//Atributos
	protected char [] arrayPalabra;;
	protected String nombre,pista;
	protected int puntos;
	
	
	//Constructorr
	public Jugador() {		
		puntos=0;
	}
	
	
	
	//setter y getter
	public void setNombre(String nombre) { this.nombre=nombre;}
	
	public void setPalabra(String palabra) { 
		arrayPalabra=new char[palabra.length()];
		for (int i=0; i<arrayPalabra.length;i++) {
			arrayPalabra[i] = palabra.charAt(i);
		}
	}
	
	public void setPista(String pista) { this.pista=pista;}
	
		
		
	public String getNombre() { return nombre;}
	
	public String getPista() {return pista;}
	
	public int getpuntos() {return puntos;}
	
	public int cantLetrasPalabra() {return arrayPalabra.length;}
	
	public void sumarPunto() {puntos++;}
	
	public int estaLetra(char letraIngresada) {
		boolean esta=false;
		int pos= -1;
		for (int i=0;i<arrayPalabra.length && !esta;i++) {
			if (letraIngresada==arrayPalabra[i]) {
				esta=true;
				pos=i;
			}
		}
		return pos;
	}
	
	public void eliminarLetra(int posicion) {
		arrayPalabra[posicion]= ' ' ;
	}



	public int getPosicionLetra(char letra) {
		int pos= -1;
		boolean flag=false;
		for (int i=0;i<arrayPalabra.length && !flag ;i++) {
			if (letra==arrayPalabra[i]) {
				flag=true;
				pos=i;
			}
		}
		return pos;
	}

}
