/*Escribir un programa que pida tres números y los muestre ordenados de mayor a menor*/

import java.util.Scanner;

public class Ejercicio6_DanielBaeza {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;

		System.out.print("Introduce un número: ");
		numero1 = scanner.nextInt();

		System.out.print("Introduce otro número: ");
		numero2 = scanner.nextInt();

		System.out.print("Introduce un tercer número: ");
		numero3 = scanner.nextInt();

		if (numero1 > numero2 && numero2 > numero3) {
			System.out.print("Los número introducidos son " + numero1 + ", " + numero2 + " y " + numero3);
		} else if (numero1 > numero3 && numero3 > numero2) {
			System.out.print("Los número introducidos son " + numero1 + ", " + numero3 + " y " + numero2);
		}

		else if (numero2 > numero3 && numero3 > numero1) {
			System.out.print("Los número introducidos son " + numero2 + ", " + numero3 + " y " + numero1);
		} else if (numero2 > numero1 && numero1 > numero3) {
			System.out.print("Los número introducidos son " + numero2 + ", " + numero1 + " y " + numero3);
		}

		else if (numero3 > numero2 && numero2 > numero1) {
			System.out.print("Los número introducidos son " + numero3 + ", " + numero2 + " y " + numero1);
		} else {
			System.out.print("Los número introducidos son " + numero3 + ", " + numero1 + " y " + numero2);
		}

	}

}
