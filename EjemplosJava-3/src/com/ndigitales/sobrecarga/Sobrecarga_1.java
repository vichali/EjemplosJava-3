package com.ndigitales.sobrecarga;

public class Sobrecarga_1 {
	
	private int resultado;
	
	public int suma() {
		int num1 = 5;
		int num2 = 10;
		resultado=num1 + num2;
		return resultado;
	}
	
	public int suma(int valor1, int valor2) {
		resultado = valor1 + valor2;
		return resultado;
	}

}
