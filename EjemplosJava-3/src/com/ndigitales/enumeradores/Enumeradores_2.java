package com.ndigitales.enumeradores;
/**
 * @author Victor
 * Generado el Aug 12, 2012
 * Descripción:Ejemplo uso de enumeradores simples 
 * Proyecto: EjemplosJava-2
 * Clase: Enumeradores_2.java
 */
public class Enumeradores_2 {

	public enum libros {JV25520,CHTP22,IW234,CSHARP23};
	
  public static void main(String[] args) {
		
	for (libros lb: libros.values()) {
		
		switch (lb) {
		case JV25520:
			System.out.println("Como programar en Java2 / Edición 2007");
			break;
		case CHTP22:
			System.out.println("Como programar en C++ / Edición 2004");
			break;
		case IW234:
			System.out.println("HTML5 la revolución web / Ed. 2010");
			break;
		case CSHARP23:
			System.out.println("Programando en C#, Edición 2005");
			break;
		}			
	}

	}

}
