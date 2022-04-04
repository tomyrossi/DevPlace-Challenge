import java.util.Scanner;

public class TestTriangulo {
	public static void main (String[] args) {
		
		int a,b,c;
		Triangulo t;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese los lados de un triangulo ");
		System.out.print("A= ");
		a = teclado.nextInt();
		System.out.print("B= ");
		b = teclado.nextInt();
		System.out.print("C= ");
		c= teclado.nextInt();
		t = new Triangulo(a,b,c);
		
		System.out.println("El triangulo es "+t.queSoy());
		
	}
}
