import java.util.Scanner;

public class Ejercicio7_DanielBaeza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero;

		System.out.print("Introduce un número entre 1 - 10: ");
		numero = scanner.nextInt();

		switch(numero) {
		case 0,1,2,3,4:
			System.out.print("Insuficiente");
			break;
		
		case 5:
			System.out.print("Suficiente");
			break;
			
		case 6:
			System.out.print("Bien");
			break;
			
		case 7:
			System.out.print("Notable");
			break;
			
		case 8:
			System.out.print("Notable");
			break;
			
		case 9:
			System.out.print("Sobresaliente");
			break;
			
		case 10:
			System.out.print("Sobresaliente");
			break;
			
		default: 
			System.out.print("Nota errónea");
			break;
			
		}
		
		/*if (numero >= 0 &&numero <= 4.9) {
			System.out.print("insuficiente, estás suspenso");
		} else if (numero >= 5 && numero < 6) {
			System.out.print("Suficiente, estás aprobado");
		} else if (numero >= 6 && numero < 7) {
			System.out.print("Bien, estás aprobado");
		} else if (numero >= 7 && numero < 9) {
			System.out.print("Notable, estás aprobado");
		} else if (numero >= 9 && numero <= 10) {
			System.out.print("Sobresaliente, buen trabajo, sigue así");
		} else {
			System.out.print("El número introducido no se encuentra entre el rango especificado");
		}*/
	}

}
