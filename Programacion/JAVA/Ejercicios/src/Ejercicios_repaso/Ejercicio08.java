package Ejercicios_repaso;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int elementos = 0;
		double media;
		int numero;
		int suma = 0;

		System.out.print("Introduce un número: ");
		numero = scanner.nextInt();

		while (numero >= 0) {

			suma += numero;
			elementos++;
			System.out.print("Introduzca un número:");
			numero = scanner.nextInt();

		}

		if (elementos == 0) {
			System.out.print("Imposible hacer la media");
		} else {
			media = (double) suma / elementos;
			System.out.print("La media es de " + media);
		}
	}
}
