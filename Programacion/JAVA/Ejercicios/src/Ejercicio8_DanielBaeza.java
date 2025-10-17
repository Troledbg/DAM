import java.util.Scanner;

public class Ejercicio8_DanielBaeza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("Introduce un número: ");
		numero1 = scanner.nextInt();
		System.out.print("Introduce un segundo número: ");
		numero2 = scanner.nextInt();
		
		/*De esta forma conseguimos que siempre el número más alto se quede detrás
		 *Da igual como introduzcamos los números, siempre vamos a conseguir que el número pequeño 
		 *esté delante*/
		int menor = 0, mayor = 0;
		if (numero1 < numero2) {
			menor = numero1;
			mayor = numero2;
		} else if(numero1 > numero2) {
			menor = numero2;
			mayor = numero1;
		}
		else {
			System.out.print("Son iguales");
		}
		for(int i = menor; menor < mayor; i++ ) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
		}
		
		
		/*if (numero1 %2 == 0) {
			System.out.println("El número "+numero1+" es par");
		} else {
			System.out.println("El nnúmero "+numero1+" es impar");
		}
		if (numero2 %2 == 0) {
			System.out.print("El número "+numero2+" es par");
		} else {
			System.out.print("El nnúmero "+numero2+" es impar");
		}*/
	}

}
