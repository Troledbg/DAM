/*Escribir un programa que pida dos número por pantalla e indique si son iguales o no.
 * Utilizar la siguiente sentencia para recoger los números insertados por teclado:
 * scanner scanner = new scanner(System.in);
 * int numero = scanner.nextlnt();*/

import java.util.Scanner;

public class Ejercicio1_DanielBaeza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;

		System.out.print("Introduce un número: ");
		numero1 = scanner.nextInt();

		System.out.print("Introduce un segundo número: ");
		numero2 = scanner.nextInt();

		System.out.print("Los números que introdujiste son " + numero1 + " y " + numero2);

		if (numero1 == numero2) {
			System.out.print(", ambos números introducidos son iguales.");
		} else {
			System.out.print(", ambos números introducidos son distintos.");
		}

	}

}
