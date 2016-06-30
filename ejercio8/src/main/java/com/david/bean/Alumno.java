package com.david.bean;

public class Alumno {
	 private String nombre;
	 private int nota;
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	 
	 public double getNota(){
		 return nota;
	 }
	 
	 public void setNota(int nota){
		 this.nota=nota;
	 }
	 
	 public void mostrarDatos(){
		 System.out.format("El nombre del alumno es %s"+"y su nota es %d \n",nombre,nota);
	 }

}
