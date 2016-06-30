package ejercicio1;

import java.util.Scanner;

public class Promedio {
	public static void main(String[] args) {
		String nombre;
		int nota1;
		int nota2;
		int nota3;
		double promedio;

		Scanner s = new Scanner(System.in);

		System.out.println("Ingrese el nombre del alumno: ");
		nombre = s.next();

		System.out.println("Introduce la nota 1: ");
		nota1 = s.nextInt();

		System.out.println("Introduce la nota 2: ");
		nota2 = s.nextInt();

		System.out.println("Introduce la nota 3: ");
		nota3 = s.nextInt();

		promedio = (nota1 + nota2 + nota3) / 3;

		if (promedio <= 10) {
			System.out.println("El alumno " + nombre + " esta desaprobado: " + promedio);
		} else {
			System.out.println("El alumno " + nombre + " esta aprobado: " + promedio);
		}

	}

}
