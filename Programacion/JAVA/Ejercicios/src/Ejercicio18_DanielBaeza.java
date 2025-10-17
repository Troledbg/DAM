import java.util.Scanner;

public class Ejercicio18_DanielBaeza {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int limite = 15;
		int suma = 0;
		int numero;
		
		for(int i=0; i<limite; i++) {
			System.out.print("Introduce un número: ");
			numero = scanner.nextInt();
			suma+= numero;
		}
		System.out.print("La suma de los 15 números es: " +suma);

	}

}
