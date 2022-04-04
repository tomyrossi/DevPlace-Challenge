
public class Triangulo {

	//Atributos
	protected String tipo;
	protected int lado1,lado2,lado3;
	
	//Constructor
	public Triangulo(int l1, int l2, int l3) {
		lado1= l1;
		lado2= l2;
		lado3= l3;
		if ((l1==l2) && (l2==l3)) tipo="Equilatero";
		else {
			if (((l1==l2) && (l1!=l3)) || ((l1==l3) && (l1!=l2)) || ((l2==l3) && (l2!=l1))) 
				tipo="Isoseles";
			else {
				if ((l1!=l2) && (l2!=l3)) tipo="Escaleno";
			}
		}
	}
	
	public String queSoy() {
		return tipo;
	}
	
}
	
	
