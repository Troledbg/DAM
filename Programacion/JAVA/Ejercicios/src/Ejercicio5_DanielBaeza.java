/*Escribir un programa que pida dos números y
 * los muestre ordenados de mayor y menor*/

import java.util.Scanner;

public class Ejercicio5_DanielBaeza {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("Introduce un número: ");
		numero1 = scanner.nextInt();
		
		System.out.print("Introduce otro número: ");
		numero2 = scanner.nextInt();
		
		if (numero1 > numero2) {
			System.out.print("Los número introducidos son " +numero1+ " y " +numero2);
		} else {
			System.out.print("Los número introducidos son " +numero2+ " y " +numero1);
		}

	}

}
