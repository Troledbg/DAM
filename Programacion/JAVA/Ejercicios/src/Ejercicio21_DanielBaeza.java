import java.util.Scanner;

public class Ejercicio21_DanielBaeza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int peldaño = 0;
		System.out.print("Introduce un número: ");
		int numero = scanner.nextInt();
		System.out.println("Realizando una escalera de " + numero + " peldaños...");

		for (int i = 0; i < numero; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
