package com.ndigitales.enumeradores;

/**
 * Fecha: 04/10/2009 04:07:06
 * @author Victor
 * Enumerados.java
 */

public class Enumerados_3 {

	//definimos un tipo enumerado
	//los tipos enumerados deben definirse siempre fuera
	//del main y, m�s en general, fuera de cualquier m�todo

	public enum Semana {LUNES, MARTES, MIERCOLES, JUEVES,
		VIERNES, SABADO, DOMINGO};


		public static void main(String[] args) {

			//definimos una variable que pertenece al tipo enumerado Semana
			//y le damos el valor que representa el d�a martes
			
			Semana hoy = Semana.MARTES;

			//si el d�a se cayese en el fin de semana no hay que trabajar
			//obs!rvese como gracias a la numeraci�n del programa es facil del entender

			if(hoy == Semana.DOMINGO || hoy == Semana.SABADO){
				System.out.println("Hoy toca descansar" );
			} else{
				System.out.println("Hoy toca trabajar");
			}

	
		}
}
