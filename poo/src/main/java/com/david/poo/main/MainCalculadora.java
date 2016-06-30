package com.david.poo.main;

import com.david.poo.bin.*;

public class MainCalculadora {
	
	public static void main(String[] args) {
		Calculadora calc =new Calculadora();
		System.out.println("Sumando 1 +3");
		calc.sumar(1, 3);
		System.out.println("Resultado: "+calc.getResultado());
	}

	
}
