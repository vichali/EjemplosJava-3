package com.ndigitales.sobrecarga;

/*
 *  La sobrecarga de métodos en Java, también conocida como Overloading, es la posibilidad de crear varios métodos con diferentes definiciones y/o 
 * comportamientos. El desarrollador debe establecer cual es la diferencia entre métodos de igual nombre. En este sentido, los métodos tendrán diferentes
 * parámetros o argumentos, en su tipo o en su orden establecido. De este modo, la JVM utiliza esa referencia para diferenciar el método al cual se hace
 * referencia a la hora de ser invocado.
 * Entonces, Java diferencia los métodos sobrecargados con base en el número y tipo de argumentos que tiene el método y no por el tipo que devuelve, su lo 
 * hubiera, o por su nombre.
 * Por ejemplo, de este modo, si se invoca a un método con un String como argumento, se ejecutará el método que tome un String como argumento, si se manda a
 * llamar al mismo método pero con un float como argumento, se ejecutará el método que tome un float como argumento y así sucesivamente. 
 * Por útltimo, si se invoca a un método con un argumento que no es definido en ninguna de las versiones sobrecargadas entonces el compilador arrojará un
 * error. 
 */
 
public class Sobrecarga_0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("Sueldo a abonar: %24s %5.2f %n"," ", sueldo());
		System.out.printf("Sueldo a abonar con extras: %11s %9.2f %n"," ",sueldo(720));
		System.out.printf("Sueldo a abonar con extras según sección: %5.2f %n",sueldo(720,4));
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
