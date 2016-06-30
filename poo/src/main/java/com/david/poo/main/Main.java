package com.david.poo.main;

import com.david.poo.bin.*;
public class Main {
	public static void main(String[] args) {
		Persona juan=new Persona();
		juan.nombre ="Juan";
		juan.apellido ="Rosas";
		juan.posicion =0;
		
		Persona pedro= new Persona();
		pedro.nombre ="Juan";
		pedro.apellido ="Rosas";
		pedro.posicion =0;
		
		juan.caminar(5);
		pedro.caminar(10);
		
		System.out.println("Juan esta en la posicion: "+juan.posicion);
		System.out.println("Pedro esta en la posicion: "+pedro.posicion);
		
		//juan.cargar(pedro, 5);
		
		Persona.cargar(juan, pedro,5);
		
		
		
		
		System.out.println("Juan cargando a pedro");
		System.out.println("Juan esta en la posicion: "+juan.posicion);
		System.out.println("Pedro esta en la posicion: "+pedro.posicion);
		
		
		
	}

}
