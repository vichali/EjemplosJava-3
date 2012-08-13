package com.ndigitales.sobrecarga;
/**
 * @author Victor
 * Generado el Aug 08, 2012
 * Descripción: 
 * Proyecto: EjemplosJava-3
 * Clase: Sobrecarga_2.java
 */
public class Sobrecarga_2_2 {

	/**
	 * Muestra resultado
	 * @param neto
	 * @param desc
	 */
	public static void mostrar(float neto, float desc) {

		System.out.printf("El descuento fue de : %6.2f %n",desc);
		System.out.printf("El total a abonar es: %6.2f", neto);
	}
	
	/**
	 * Calcula total a pagar si tiene descuento por promoción
	 * @param importe
	 * @param tasa
	 * @param descuento
	 */
	public void calculo(int importe, int tasa, float descuento) {
		if (importe > tasa) {
			beneficio(importe,descuento);
		} else {
			beneficio(importe);
		}
	}
	
	/**
	 * Calcula total si no alcanza el descuento por promoción
	 * @param imp
	 */
	public static void beneficio(int imp) {
		mostrar(imp, 0);
	}
	
	/**
	 * Calcula total si alcanza el descuento por promoción
	 * @param imp
	 * @param desc
	 */
	public static void beneficio(int imp, float desc) {
		float neto, descuento;
		descuento = (imp * desc) / 100;
		neto = imp - descuento;
		mostrar(neto,descuento);
	}
	
	
}
