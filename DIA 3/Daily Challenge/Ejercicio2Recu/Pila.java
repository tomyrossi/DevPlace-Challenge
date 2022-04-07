package Ejercicio2Recu;

public class Pila {
	private int size;
	private int top = -1;
	private int pila[];
	
	
	public Pila(int size) {
		this.size = size;
		pila = new int[size];
	}
	
	public void push(int elemento) {
		pila[++top]=elemento;
	}
	
	public int pop() {
		return pila[top--];
	}
	
	public int top() {
		return pila[top];
	}
	
	public boolean empty() {
		return this.top<0;
	}
	
	public boolean full() {
		return this.top == this.size-1;
	}
}
