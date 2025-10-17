import java.util.Scanner;

public class Ejercicio10_DanielBaeza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		System.out.print("Introduce un día: ");
		int dia = scanner.nextInt();
		System.out.print("Introduce un mes: ");
		int mes = scanner.nextInt();
		System.out.print("Introduce un año: ");
		int anio = scanner.nextInt();
		
		if (anio > 0 && anio % 4 == 0 && mes == 2 && (dia > 0 && dia <= 29)) {
			System.out.print("Fecha correcta: "+dia+"/"+mes+"/"+anio);
		}
		
		if (anio == 0) {
			System.out.println("Fecha Incorrecta");
		} else if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && (dia < 0 && dia <= 30)) {
			System.out.println("Fecha correcta: "+dia+"/"+mes+"/"+anio);
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && (dia > 0 && dia <= 30)) {
			System.out.print("Fecha correcta: " +dia+"/"+mes+"/"+anio);
		} else if(mes ==1 || mes ==3 || mes ==5 || mes ==7 || mes ==8 || mes ==10 || mes ==12 
				&& (dia >0 && dia <= 31)) {
			System.out.print("Fecha correcta: " +dia+"/"+mes+"/"+anio);
		} else {
			System.out.print("Fecha incorrecta");
		}
		
		
		if(anio %4 == 0) {
			System.out.print("El año "+anio+" es bisiesto");
		}
		

	}

}
