package Ejercicios03;

public class Main {

	public static void main(String[] args) {
		Mesa mesaDefecto = new Mesa();
		Mesa mesaNegraHierro = new Mesa(120, 60, 60);
		Mesa miMesa = new Mesa(150, 80, 80, "verde", "madera");
		
		System.out.print("Información de las mesas con mostrarInfo()");
		
		mesaDefecto.mostrarInfo();
		mesaNegraHierro.mostrarInfo();
		miMesa.mostrarInfo();
		
		System.out.println();
		System.out.print("Información de las mesas con toString()");

	}

}
