import java.util.Scanner;

public class Ejercicio19_DanielBaeza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero2;
		int numero;
		int factorial = 1;
		do {
			System.out.print("Introduce un número: ");
			numero = scanner.nextInt();
		} while (numero <= 0);

		for(int i=2; numero>=i; i++) {
			
			factorial*= i;
		
		}	
		System.out.print("El factorial del número introducido es: "+factorial);
	}

}
