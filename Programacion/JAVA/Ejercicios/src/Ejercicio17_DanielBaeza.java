import java.util.Scanner;

public class Ejercicio17_DanielBaeza {

	public static void main(String[] args) {
		
		int NumeroAdivinar = (int)(Math.random()*100)+1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Juguemos a un juego. Tengo un número guardado, a ver si lo adivinas!!");
		int numero = 0;
		do {
			System.out.print("Introduce un número por pantalla: ");
			numero = scanner.nextInt();
			
			if (numero < NumeroAdivinar) {
				System.out.println("El número "+numero+" es MENOR que el número a adivinar");
			} else if (numero > NumeroAdivinar) {
				System.out.println("El número "+numero+" es MAYOR que el número a adivinar");
			}
			
		} while (numero != NumeroAdivinar) ;{
			System.out.print("Enhorabuena!!, Conseguiste adivinarlo");
		}
			
		

	}

}
