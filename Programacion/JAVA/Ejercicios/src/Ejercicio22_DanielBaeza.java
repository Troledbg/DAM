import java.util.Scanner;

public class Ejercicio22_DanielBaeza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int peldaño = 0;
		System.out.print("Introduce un número: ");
		int numero = scanner.nextInt();
		System.out.println("Realizando una escalera inversa de " + numero + " peldaños...");

		for (int i = numero; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
