package Ejercicio1Pila;

public class Pila {
	private int size;
	private int top = -1;
	private Object pila[];
	
	
	public Pila(int size) {
		this.size = size;
		pila = new Object[this.size];
	}
	
	public void push(Object elemento) {
		pila[++top]=elemento;
	}
	
	public Object pop() {
		return pila[top--];
	}
	
	public Object top() {
		return pila[top];
	}
	
	public boolean empty() {
		return this.top<0;
	}
	
	public boolean full() {
		return this.top == this.size-1;
	}
}