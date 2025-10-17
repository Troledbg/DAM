package Ejercicios_repaso;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String cadena;
		int longitud = 0;
		int contador = 0;
		char caracter;
		
		System.out.print("Introduce una cadena de texto: ");
		cadena = scanner.nextLine();
		longitud = cadena.length();
		
		for (int i = 0; (i < longitud); i++) {
			caracter = cadena.toUpperCase().charAt(i);
			if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
				contador ++;
			}
		}
		System.out.print("La cadena de datos introducida tiene "+contador+" vocales");
	}

}
