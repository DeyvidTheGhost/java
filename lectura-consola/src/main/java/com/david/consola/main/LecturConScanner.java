package com.david.consola.main;

import java.util.Scanner;

public class LecturConScanner {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Ingresa tu nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese su apellido: ");
		String apellido = scanner.nextLine();
		
		System.out.println("Ingrese su edad: ");
		int edad = scanner.nextInt();
		
		System.out.format("Su nombre es %s su apellido es %s y tiene %d años\n",nombre,apellido,edad);
		
		scanner.close();
		
	}
	
	

}
