
import java.util.Scanner;

public class Bloque12 {
	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero a evaluar: ");
		a = s.nextInt();
		a %= 2;

		if (a == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.print("El numero es impar");
		}
	}

}
