import java.util.Scanner;

public class Ejercicio15_DanielBaeza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int contador = 0;
			do {
			System.out.print("Introduce un número: ");
			numero = scanner.nextInt();
			
			if (numero >= 0) {
				System.out.println("Número introducido: "+numero);
				contador++;
			}
			
			} while (numero >= 0); {
			System.out.println("Programa terminado");
			System.out.print("Se han introducido "+contador+" números");
			} 
		

	}

}
