package com.david.console.main;

import java.util.Scanner;

public class LecturaConScanner {
	public static void main(String [] args){
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese su apellido");
		String apellido = scanner.nextLine();
		
		System.out.println("Ingrese su edad: ");
		int edad = scanner.nextInt();
		
		System.out.printf("Su nombre es %S,y su apellido es %S, su edad es %d a\u00F1os",nombre,apellido,edad);
	}

}
