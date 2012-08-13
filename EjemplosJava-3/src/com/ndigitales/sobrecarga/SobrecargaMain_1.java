package com.ndigitales.sobrecarga;
/**
 * @author Victor
 * Generado el Aug 08, 2012
 * Descripción: Ejemplo de sobrecarga de métodos
 * Proyecto: EjemplosJava-3
 * Clase: Caso_1.java
 */
public class SobrecargaMain_1 {
	
	public static void main(String[] args) {

	   Sobrecarga_1 sumar = new Sobrecarga_1();
		
		System.out.println("El total es: " + sumar.suma());
		System.out.println("El total con parametros es: "+sumar.suma(450, 380));
		
	}
	
	

}
