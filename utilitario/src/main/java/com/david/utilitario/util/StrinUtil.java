package com.david.utilitario.util;

import java.nio.channels.CancelledKeyException;

/**
 * clase con metodos complementarios para la clase string
 * 
 * @see java.lang.String
 * @author david
 * @since 1.0
 *
 */

public class StrinUtil {
	/**
	 * retorna una cadena con el primer caracter con mayuscula y los demas
	 * caracteres en minuscula
	 * <p>
	 * example: <blockquote>
	 * 
	 * <pre>
	 * StringUtil.capatilize("deyvid") returns  "Deyvid"
	 ** @since 1.0
	 *  &#64;param cadena
	 *            :palabra que se va a evaluar
	 * &#64;return palabra ya capitalizada
	 * </pre>
	 * 
	 * </blockquote>
	 */
	public static String capitalize(String cadena) {
		if (cadena == null || cadena.isEmpty()) {
			return cadena;
		}
		String primerLetra = cadena.substring(0, 1);
		primerLetra = primerLetra.toUpperCase();
		String demasLetras = cadena.substring(1);
		demasLetras = demasLetras.toLowerCase();
		return primerLetra + demasLetras;

	}

	/**
	 * <p>
	 * Corta la cadena de texto a cierto tamaño de caracter
	 *
	 * 
	 * @param cadena
	 *            : cadena que se va a truncar
	 * @param mCarac
	 *            : cantidad de letras que se va a cortar
	 * @return :retorna la palabra truncada
	 * @since 1.1
	 */

	public static String truncate(String cadena, int mCarac) {
		if (cadena == null) {
			return cadena;
		}
		if (cadena.length() <= mCarac) {
			return cadena;
		}
		String cadenaCortada = cadena.substring(0, mCarac);
		return cadenaCortada;

	}

	public static String times(String cadena, int times) {
		if (cadena == null) {
			return cadena;
		}

		String resultado = "";

		for (int i = 0; i < times; i++) {
			resultado += cadena;
		}
		return resultado;

	}

	/**
	 * Invierte na cadena
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            cadena a invertir
	 * @return retorna la cadena invertida
	 */

	public static String reverse(String cadena) {
		String resultado = "";
		if (cadena == null) {
			return cadena;
		} else {

			for (int i = cadena.length() - 1; i >= 0; i--) {
				resultado += cadena.charAt(i);
			}
		}
		return resultado;
	}

	/**
	 * Recibe una cadena cmo parametro y le apica captalize a cada palabra que
	 * tenga esa cadena. Una palabra es cada conjunto de caracteres separados
	 * por un espacio.
	 * 
	 * ejm: StringUtil.capitaizeAllWords("hola mundo") ->"Hola Mundo"
	 * StringUtil.capitaizeAllWords(" java wOrld") ->" Java World"
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            cadena de entrada
	 * @return String con palabras internas capitalizadas
	 */

	public static String capitalizeAllWords(String cadena) {
		boolean esInicioDePalabra = true;
		String resultado = "";
		for (int i = 0; i < cadena.length(); i++) {
			char caracterActual = cadena.charAt(i);
			char caracterTransformado;
			caracterTransformado = esInicioDePalabra ? Character.toUpperCase(caracterActual)
					: Character.toLowerCase(caracterActual);

			boolean esEspacioEnBlanco = Character.isWhitespace(caracterActual);
			esInicioDePalabra = esEspacioEnBlanco;
			resultado += caracterTransformado;
		}
		return resultado;
	}

	// public static void main(String[] args) {
	// String cadenaEntrada1= "hola mUndo";
	// String cadenaEntrada2= "java w0rld";
	// String cadenaEntrada3= "UNAC CAÑETE";
	//
	// System.out.println("IN: ´"+cadenaEntrada1+"´");
	// System.out.println("OUT:
	// ´"+StrinUtil.capitalizeAllWords(cadenaEntrada1)+"´");

	// System.out.println("OUT:
	// ´"+StrinUtil.capitalizeAllWords(cadenaEntrada1)+"´");
	// System.out.println("OUT:
	// ´"+StrinUtil.capitalizeAllWords(cadenaEntrada1)+"´");

	// System.out.println("OUT:
	// ´"+StrinUtil.capitalizeAllWords(cadenaEntrada1)+"´");
	// System.out.println("OUT:
	// ´"+StrinUtil.capitalizeAllWords(cadenaEntrada1)+"´");

	//
	// }

	public static String swapCase(String cadenaTexto) {
		String z = "";
		if (cadenaTexto == null) {//javac **.java
			return cadenaTexto;
		} else {
			for (int i = 0; i < cadenaTexto.length(); i++) {
				char x = cadenaTexto.charAt(i);
				char y;
				if (Character.toUpperCase(x) != x) {
					y = Character.toUpperCase(x);
					// System.out.println(y);
					// System.out.println("ffffffffffff");
				} else {
					y = Character.toLowerCase(x);
					// System.out.println(y);
				}

				z += y;

			}
		}
		return z;

	}
	
	

	// public static void main(String[] args) {
	// System.out.println(swapCase("java"));
	// System.out.println(swapCase("JAVA"));
	// System.out.println("jAVa");
	// System.out.println("");
	// }

	public static String fullTrim(String cadenaTexto) {
		boolean esEspacio = true;
		String resultado = "";
		String cadenaTrim = cadenaTexto.trim();

		for (int i = 0; i < cadenaTrim.length(); i++) {
			char letra = cadenaTrim.charAt(i);

			if (!Character.isWhitespace(letra)) {
				resultado += letra;
				esEspacio = true;
			 } else if (Character.isWhitespace(letra) && esEspacio){
			
				 resultado += letra;
				 esEspacio = false;
			 }
		}

	return resultado;

	}
	
	

	public static void main(String[] args) {
		System.out.println(fullTrim("    david   bombom  "));
		System.out.println(fullTrim(" david    reyes"));
		System.out.println(fullTrim("   palacios    reyes    deyvid   cristhian       "));
	}

}
