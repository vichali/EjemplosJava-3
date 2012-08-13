package com.ndigitales.sobrecarga;

import java.util.Scanner;

public class Sobrecarga_2_1 {
	
	Scanner datos = new Scanner(System.in);

	/**
	 * Ingreso del importe de la venta
	 * @param promo
	 * @param descuento
	 */
	public void ingresandoDatos(int promo, float descuento) {
		int ventaTotal;
		System.out.print("Importe de la venta: ");
		ventaTotal = datos.nextInt();
		
		Sobrecarga_2_2 sc = new Sobrecarga_2_2();
		sc.calculo(ventaTotal, promo, descuento);
		
		
 } // end ingresandoDatos
} // end clase

