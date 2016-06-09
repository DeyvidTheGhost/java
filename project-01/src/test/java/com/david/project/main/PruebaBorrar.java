package com.david.project.main;

public class PruebaBorrar {
	public static void main(String[] args) {
		String saludo="Hola";
		String cadena="Hola";
		String cad1= new String("Hola");
		String cad2= new String("Hola");				
		
		if(saludo==cadena){
			System.out.println("true");
		}
		else{
			System.out.println("False");
		}
		
		String message=(saludo==cadena)?"true":"false";
			System.out.println(message);
			
		boolean result=(cad1==cad2)?true:false;
		System.out.println(result);
		
		System.out.println((saludo==cad1)?true:false);
		
		System.out.println(saludo.equals(cad1)?true:false);
		
	}
}
