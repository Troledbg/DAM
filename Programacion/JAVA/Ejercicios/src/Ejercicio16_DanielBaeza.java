import java.util.Scanner;

public class Ejercicio16_DanielBaeza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int e=0;
		do {
		System.out.print("Introduce la cantidad de números que deseas introducir: ");
		e = scanner.nextInt();
		} while (e <= 0);
		
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;

		for (int i = 0; i < e; i++) {

			System.out.print("Introduce un número: ");
			int numero = scanner.nextInt();

			if (numero == 0) {
				contador1++;
			} else if (numero < 0) {
				contador2++;
			} else {
				contador3++;
			}

		}

		System.out.println("Has introducido " + contador1 + " número/s igual/es que 0");
		System.out.println("Has introducido " + contador2 + " número/s menore/s que 0");
		System.out.print("Has introducido " + contador3 + " número/s mayore/s que 0");

	}

}
