package com.ndigitales.sobrecarga;

public class Sobrecarga_0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("Sueldo a abonar: %24s %5.2f %n"," ", sueldo());
		System.out.printf("Sueldo a abonar con extras: %11s %9.2f %n"," ",sueldo(720));
		System.out.printf("Sueldo a abonar con extras según sección: %5.2f %n",sueldo(720,1));
	}
	
	public static float sueldo() {
		return 4300f;
	}

	public static float sueldo(int extras) {
		return 3450f + extras;
	}
	
	public static float sueldo(int extras, int seccion) {
		float salarioDepto=0;
		switch (seccion) {
		case 1: // contaduria
			salarioDepto = 3780f;
			break;
		case 2: // ventas
			salarioDepto = 3300f;
			break;
		case 3: // supervisor
			salarioDepto = 4680f;
			break;
		default:
			salarioDepto = 2600f;
			break;
		}
		return salarioDepto + extras;
	}
}
