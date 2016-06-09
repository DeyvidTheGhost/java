package com.david.consola.main;

import java.io.Console;

public class LecturaConConsole {
	public static void main(String []args){
		
		
		Console console= System.console();
		if( console != null){
		
		System.out.println("Ingresa tu nombre: ");
		String nombre = console.readLine();
		
		System.out.println("Ingrese su apellido: ");
		String apellido = console.readLine();
		
		System.out.println("Ingrese su edad: ");
		int edad = Integer.parseInt(console.readLine());
		
		System.out.println("Ingerse su password: ");
		char[] password= console.readPassword();
		String passwordStr =new String(password);
		
		System.out.format("Su nombre es %s su apellido es %s y tiene %d años\n",nombre,apellido,edad);
		System.out.println("su password es: "+passwordStr);
		}else{
			System.out.println("La aplicaci\00F3n no pdo encontrar una consola");
		}
	}
}
