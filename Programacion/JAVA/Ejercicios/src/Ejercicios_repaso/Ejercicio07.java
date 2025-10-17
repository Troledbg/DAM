package Ejercicios_repaso;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int numero; 
		
		
		do {
			System.out.print("Introduce un número entre 0 y 99: ");
			numero = scanner.nextInt();
			unidades = numero % 10; 
			decenas = numero / 10;
			
			}while(numero < 0 || numero > 99);
		
		

	}

}
