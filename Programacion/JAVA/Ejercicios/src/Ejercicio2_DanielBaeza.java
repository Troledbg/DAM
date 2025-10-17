/*Escribir un programa que pida un número por pantalla
 * e indique si es positivo o negativo*/

import java.util.Scanner;

public class Ejercicio2_DanielBaeza {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero;

		System.out.print("Introduce un número: ");
		numero = scanner.nextInt();

		if (numero >= 0) {
			System.out.print("El número " + numero + " es positivo");
		} else {
			System.out.print("El número " + numero + " es negativo");
		}

	}

}
