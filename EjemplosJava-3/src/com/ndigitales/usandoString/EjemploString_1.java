package com.ndigitales.usandoString;

public class EjemploString_1 {

	
	public static void main(String[] args) {
		String txt, txt_2;
		txt = "Los viernes son mejores";
		txt_2 = "    y los domingos maso";
		
		System.out.println("Descartamos el espacio en blanco de una cadena");
		System.out.println(txt + txt_2.trim());
		System.out.println();
		
		System.out.println(txt);
		System.out.println(txt.substring(0, 10));
		System.out.println("0123456789\n");
		
		System.out.println("Extraigo de la 3era hasta la 6ta pos");
		System.out.println(txt);
		System.out.println("0123456789");
		System.out.println(txt.substring(3, 6));
		
		System.out.println();
		System.out.print("La longuitud de la cadena es de: ");
		System.out.println(txt.length()+ " caracteres\n");
		
		System.out.println(txt.concat(" y los sábados son mejores ").concat("aún"));
		
		System.out.println("La cadena está vacía ? ");
		System.out.println(txt_2.isEmpty()); // si length es 0 es true

		System.out.println();
		System.out.println(txt);
		System.out.print("La cadena contiene la palabra \"son\" ? ");
		System.out.println(txt.contains("son"));

		System.out.println();
		System.out.println(txt);
		System.out.print("La cadena contiene la palabra \"jueves\" ? ");
		System.out.println(txt.contains("jueves"));

		System.out.println();
		System.out.println("Convertimos todo a minúsculas: " + txt.toLowerCase());
		System.out.println();
		System.out.println("Convertimos todo a mayúsculas: " + txt.toUpperCase());
		
		System.out.println();
		System.out.println("La cadena termina con mejores ? " + txt.endsWith("mejores"));
		
		System.out.println();
		System.out.println("La cadena empieza con Los Viernes ? " + txt.startsWith("Los viernes"));
		
		System.out.println();
		String txt_1 = "LOS VIERNES SON MEJORES";
		System.out.println("La cadena " + txt);
		System.out.println("y la cadena " + txt_1 + " son iguales ?");
		System.out.println(txt.equals(txt_1));
		System.out.println();
		
		txt_1 = "LOS VIERNES SON MEJORES";
		System.out.println("Pero si NO tengo en cuenta, mayúsculas, La cadena\n" + txt);
		System.out.println("y la cadena " + txt_1 + " son iguales ?");
		System.out.println(txt.equalsIgnoreCase(txt_1));
		System.out.println();
		
		String colores = "rojo,amarillo,verde,azul,morado,marrón";
		String[] arrayColores = colores.split(",");
		for (String colo : arrayColores) System.out.println(colo);
		System.out.println();
		
		String codigo = "50289-05.jpg";
		int inicio = codigo.indexOf("-");
		int fin = codigo.indexOf(".", inicio + 1);
		System.out.println(codigo);
		System.out.println("012345678901");
		System.out.println(codigo.substring(inicio + 1, fin));

		String texto = "Nosotros podemos";
		System.out.println();
		System.out.println(texto);
		System.out.println("01234567890");
		System.out.println(texto.charAt(7));
		System.out.println();
		
	}

}
