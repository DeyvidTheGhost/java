package com.david.console.main;

import java.io.Console;

public class LecturaConConsola {
	public static void main(String[] args) {

		Console consola = System.console();
		System.out.println("Ingresa tu nombre: ");

		String nombre = consola.readLine();
		System.out.println("Ingrese su apellido: ");

		String apellido = consola.readLine();
		System.out.println("Ingrese su edad: ");
		int edad = Integer.parseInt(consola.readLine());
		System.out.println("Ingrese su password: ");
		char[] password = consola.readPassword();
		String passwordStr = new String(password);

		System.out.format("Su nombre es %s , y su apellido es %s, su edad es %d a\u00F1os", nombre, apellido, edad);
		System.out.println("Su password es: " + passwordStr);

	}

}
