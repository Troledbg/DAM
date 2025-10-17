package Ejercicios_repaso;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sueldo;
		int sueldo_max;
		int n;
		sueldo_max = 0;


		System.out.print("Introduce un número de sueldos: ");
		n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
		System.out.print("Introduce el sueldo: ");
		sueldo = scanner.nextInt();
		
		if (sueldo > sueldo_max) {
			sueldo_max = sueldo;
		}
		}
		System.out.print("\nEl sueldo máximo es: " + sueldo_max);
	}
	
}
