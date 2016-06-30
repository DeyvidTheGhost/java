package com.david.poo.bin;

public class Persona {
	 public String nombre;
	public String apellido;
	public int posicion;
	
	public void caminar(int metros){
		posicion+=metros;
	}
	
	public void cargar(Persona persona,int metros){
		posicion +=metros;
		persona.posicion+=metros;
	}
	
	public static void cargar(Persona elQueCarga,Persona elCargado, int metros){
		elQueCarga.posicion+=metros;
		elCargado.posicion+=metros;
	}

}
