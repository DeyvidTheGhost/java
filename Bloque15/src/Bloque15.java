import java.util.Scanner;

public class Bloque15 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce el primer numero A: ");
		a = s.nextInt();

		System.out.println("Introduce el segundo numero B: ");
		b = s.nextInt();

		c = a;
		a = b;
		b = c;

		System.out.println("Los numeros cambiados son A: " + a+" y B es: " + b);

	}
}
