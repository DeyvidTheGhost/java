package com.david.poo.bin;

public class Calculadora {
	private int resultado;
	
	public void sumar(int sumando1, int sumando2){
		resultado= sumando1 +sumando2;
	}
	
	public void restar(int minuendo, int sustraendo){
		resultado= minuendo-sustraendo;
	}
	
	public void multiplicar(int num1, int num2){
		resultado= num1*num2;
	}
	
	public void dividir(int num1, int num2){
		resultado= num1/num2;
	}
	
		
	public int getResultado(){
		return resultado;
	}
	

}
