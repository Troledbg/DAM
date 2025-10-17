import java.util.Scanner;

public class Ejercicio9_DanielBaeza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el día: ");
		int dia = scanner.nextInt();
		System.out.print("Introduce el mes: ");
		int mes = scanner.nextInt();
		System.out.print("Introduce el año: ");
		int anio = scanner.nextInt();
		
		if (anio>0 && (mes>0 && mes <=12) && (dia>0 && dia<=30)) {
			System.out.print("La fecha: "+dia+"/"+mes+"/"+anio+" es correcta");
		} else {
			System.out.print("La fecha: "+dia+"/"+mes+"/"+anio+" es incorrecta");
		}
	}

}
