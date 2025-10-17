import java.util.Scanner;

public class Ejercicio14_DanielBaeza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.print("Introduce un número: ");
			numero = scanner.nextInt();
		} while (numero <= 0); {
			int cuadrado = numero * numero;
			System.out.print(cuadrado);
		}
		
	
	}

}
