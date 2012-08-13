package com.ndigitales.sobrecarga;
/**
 * @author Victor
 * Generado el Aug 8, 2012
 * Descripción: Ejemplo Sobrecarga de métodos
 * Proyecto: EjemplosJava-3
 * Clase: Sobrecarga_3.java
 */
public class Sobrecarga_3 {

	/**
	 * Muestra en pantalla el resultado del método que lo llama
	 * @param texto
	 */
	public void visualizar(String texto) {
		System.out.println(texto);
	}
	
	/**
	 * Metodo sumar con dos parámetros enteros
	 * @param num1
	 * @param num2
	 */
	public void sumar(int num1, int num2) {
		int resultado = num1 + num2;
		visualizar("El resultado de la suma es: " + resultado);
	}
	
	/**
	 * Método sumar sobrecargado con tres métodos
	 * @param num1
	 * @param num2
	 * @param num3
	 */
	public void sumar(int num1, int num2, int num3) {
		int resultado = num1 + num2 + num3;
		visualizar( "El resultado de la suma de dos valores es: " + resultado);
	}
	
	/**
	 * Método multiplicar con dos parámetros enteros
	 * @param valor1
	 * @param valor2
	 */
	public void multiplicar(int valor1, int valor2) {
		int resultado = valor1 * valor2;
		visualizar("El resultado de la multiplicación es: " + resultado);
	}
	
	/**
	 * Clase main 
	 * @param args
	 */
	public static void main(String[] args) {
		Sobrecarga_3 calculos = new Sobrecarga_3();
		calculos.sumar(20, 55);
		calculos.sumar(230, 121,345);
		calculos.multiplicar(34, 12);
	}
}
