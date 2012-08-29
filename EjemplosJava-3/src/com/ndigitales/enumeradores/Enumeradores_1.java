package com.ndigitales.enumeradores;
import java.util.Scanner;


public class Enumeradores_1 {

/**
 * @author Victor
 * Generado el Aug 12, 2012
 * Descripción: Uso de los Enum (enumeradores) 
 * Proyecto: EjemplosJava-2
 * Clase: Enumeradores_1.java
 * 
 * Enumeradores: 
 * A partir de Java 5 se puede utilizar ENUM (enumeradores). Estos son un 
 * conjunto de valores predefinidos, o sea, un conjunto de constantes que se
 * representan como identificadores únicos. 
 * Esto permiter restringir una selección de valores a algunos
 * previamente definidos. Ej. Días de las semana. Categorías de una línea de
 * productos, etc.
 * Los tipos enum, son implicitanmente final, ya que declaran constantes que
 * no deben modificarse.
 * Son implicitamente static
 * Cualquier intento de crear un objeto de tipo enum con el operador new 
 * produce un error de compilación
 */

	public enum fotosTam {Chico,Grande,ExtraGrande};
	
	public static void main(String[] args) {
		Scanner ingresa = new Scanner(System.in);
		fotosTam ft = null;

		System.out.println("Definir tamaño");
		System.out.println("1 - Chico");
		System.out.println("2 - Grande");
		System.out.println("3 - Extra Grande");
		System.out.print("Su opción ? ");
		System.out.println();
		int opc = ingresa.nextInt();

		switch (opc) {
		case 1:
			ft = fotosTam.Chico;
			break;
		case 2:
			ft = fotosTam.Grande;
			break;
		case 3:
			ft = fotosTam.ExtraGrande;
			break;
		}
		
		System.out.println("Seleccionó " + ft);
		
	}

}
