import java.util.Scanner;

public class Ejercicio20_DanielBaeza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int NotasDadas = 6;
		int Suspenso = 0;
		int Suficiente = 0;
		int Bien = 0;
		int Notable = 0;
		int Sobresaliente = 0;
		int nota;

		for (int i = 0; i < NotasDadas; i++) {

			do {
				System.out.print("Introduce una nota: ");
				nota = scanner.nextInt();
			} while (nota < 0 || nota > 10);

			switch (nota) {
			case 0, 1, 2, 3, 4:
				Suspenso++;
				break;
			case 5:
				Suficiente++;
				break;
			case 6:
				Bien++;
				break;
			case 7, 8:
				Notable++;
				break;
			case 9, 10:
				Sobresaliente++;
				break;
			}
		}

		if (Suspenso > 0) {
			System.out.println("Hay " + Suspenso + " suspenso/s");
		}
		if (Suficiente > 0) {
			System.out.println("Hay " + Suficiente + " suficiente/s");
		}
		if (Bien > 0) {
			System.out.println("Hay " + Bien + " bien/es");
		}
		if (Notable > 0) {
			System.out.println("Hay " + Notable + " notable/s");
		}
		if (Sobresaliente > 0) {
			System.out.println("Hay " + Sobresaliente + " sobresaliente/s");
		}
	}

}
