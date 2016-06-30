package bloque16;

import java.util.Scanner;

public class Bloque16 {
	public static void main(String[] arg) {
		int a, b, c;
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce las horas: ");
		a = s.nextInt();

		System.out.println("Introduce los minutos: ");
		b = s.nextInt();

		System.out.println("Introduce los segundos: ");
		c = s.nextInt();

//		a += 1;
//		b += 1;
//		c += 1;

		if ((a >= 0 && a < 24) && (b >= 0 && b < 60) && (c >= 0 && c < 60)) {
			System.out.println("La hora introducida es correcta");
			System.out.println("La hora es " + a + ":" + b + ":" + c);

		}else{
			System.out.println("Introduzca la hora correcta");
		}

	}

}
