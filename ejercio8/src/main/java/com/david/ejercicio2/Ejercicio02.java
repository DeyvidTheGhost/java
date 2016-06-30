package com.david.ejercicio2;

import java.util.Arrays;
import java.util.Scanner;
import com.david.utilitario.util.StrinUtil;
import com.david.bean.Alumno;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Alumno[] alumnos = new Alumno[3];
		// System.out.println(alumnos);
		// System.out.println(Arrays.toString(alumnos));
		// alumnos[0].setNombre("Nombre");

		for (int i = 0; 1 < alumnos.length; i++) {
			Alumno alumno = new Alumno();
			System.out.println("Ingrese el nombre del alumno: " + (i + 1));
			alumno.setNombre(s.nextLine());
			System.out.println("Ingrese la nota del alumno: " + (i + 1));
			alumno.setNota(s.nextInt());
			s.nextLine();
			System.out.println("Se va a agregar el alumno: " + alumno.getNombre() + "," + alumno.getNota());
			alumnos[i] = alumno;
			System.out.println("nuevo alumno agregado en el indice: " + i);
		}

//		for (Alumno alumno:alumnos) {
//			alumno.mostraDatos();
//		}
		s.close();

		// //
		// System.out.println("Ingrese el nombre del primer alumno: ");
		// nombAlumno[0] = s.nextLine();
		//
		// System.out.println("Ingrese primera nota1: ");
		// notas[0] = s.nextInt();
		//
		// System.out.println("Ingrese el nombre del segundo alumno: ");
		// nombAlumno[1] = s.nextLine();
		//
		// System.out.println("Ingrese nota2: ");
		// notas[1] = s.nextInt();
		//
		// System.out.println("Ingrese el nombre del tercer alumno: ");
		// nombAlumno[2] = s.nextLine();
		//
		// System.out.println("Ingrese primera nota3: ");
		// notas[2] = s.nextInt();

		System.out.println("El nombre del alumno es: " + nombAlumno + " y su nota es: " + notas);

		s.close();

	}

}
