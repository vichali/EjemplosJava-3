package com.ndigitales.sobrecarga;

public class Sobrecarga_2_0 {
	
	public void parametros() {
		
		final int PROMOCION = 4000;
		final float DESCUENTO = 23;
		
		Sobrecarga_2_1 calcularImporteFinal = new Sobrecarga_2_1();
		
		calcularImporteFinal.ingresandoDatos(PROMOCION, DESCUENTO);
		
	}
	
}
