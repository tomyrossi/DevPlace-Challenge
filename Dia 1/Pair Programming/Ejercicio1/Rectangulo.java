package Ejercicio1;

public class Rectangulo {
	//atributos
		public int ladoMayor,ladoMenor;
		
		//Constructor
		public Rectangulo(int ladoMayor,int ladoMenor) {
			this.ladoMayor = ladoMayor;
			this.ladoMenor = ladoMenor;
		}
			
		public float perimetro() {
			return (ladoMayor*2)+(ladoMenor*2);
		}
			
		public float superficie() {
			return ladoMayor*ladoMenor;
		}
}
