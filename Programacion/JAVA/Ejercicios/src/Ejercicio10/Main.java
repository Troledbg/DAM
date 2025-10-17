package Ejercicio10;

public class Main {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("74521874L", "Pepe López", 40, true);
		Empresa empresa1 = new Empresa("65784439J", "InforOcaña SA", empleado1);
		
		empleado1.calculaSueldo();
		empresa1.mostrarInfo();

	}

}
