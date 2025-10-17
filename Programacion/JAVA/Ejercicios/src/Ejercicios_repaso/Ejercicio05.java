package Ejercicios_repaso;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
				
		System.out.print("Introduce un primer número: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Introduce un segundo número: ");
		int num2 = scanner.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.print("Estos números SI son múltiplos");
		} else {
			System.out.print("Estos número NO son múltiplos");
		}
	}

}
