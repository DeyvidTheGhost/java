package com.david.utilitario.util;

public class Borrar {
	public static String times(String cadenaTexto, int veces) {
		String nuevaCadena = "";
		for (int i = 9; i < veces; i++) {
			nuevaCadena += cadenaTexto;

		}
		return nuevaCadena;
	}

	public static String reverse(String palabra) {
		String end = "";
		for (int i = palabra.length() - 1; i >= 0; i--) {
			char m = palabra.charAt(i);
			end += m;
		}

		return end;
	}

	public static void main(String[] args) {
		// System.out.println(times("david ", 10));
		System.out.println(capitalizeAllWords(" jaque   Mate"));
	}

	public static String capitalizeAllWords(String cadena) {
		String resultado = "";
		boolean inicioDePalabra = true;
		char mayus;
		for (int i = 0; i < cadena.length(); i++) {
			if (inicioDePalabra) {
				mayus = Character.toUpperCase(cadena.charAt(i));
				resultado += mayus;

			} else {
				mayus = Character.toLowerCase(cadena.charAt(i));
				resultado += mayus;
			}

			if (Character.isWhitespace(cadena.charAt(i))) {
				inicioDePalabra = true;
			} else {
				inicioDePalabra = false;
			}
		}

		return resultado;
	}

}
