/*Escribir un programa que pida dos números
 * e indique cual es el mayor.
 * A partir del Ejercicio03, añadir una nueva
 * condición para indicar si son iguales*/

import java.util.Scanner;

public class Ejercicio3y4_DanielBaeza {

	public static void main(String[] args) {

		Scanner daniel = new Scanner(System.in);

		int numero1;
		int numero2;

		System.out.print("Introduce un número: ");
		numero1 = daniel.nextInt();

		System.out.print("Introduce otro número: ");
		numero2 = daniel.nextInt();

		if (numero1 > numero2) {
			System.out.print("El número " + numero1 + " es mayor que el número " + numero2);
		} else if (numero1 == numero2) {
			System.out.print("Los números " + numero1 + " y " + numero2 + " son iguales");
		} else {
			System.out.print("El número " + numero2 + " es mayor que el número " + numero1);
		}
	}

}
