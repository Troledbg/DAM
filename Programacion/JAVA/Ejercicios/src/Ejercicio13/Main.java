package Ejercicio13;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Propietario Propietariov1 = new Propietario("Penelope","Cruz","37902218J");
		Vehiculo v1 = new Vehiculo();
		v1.modificaPropietarioVehiculo(Propietariov1);
		System.out.println("Información del primer vehículo: ");
		v1.mostrarInfo();
		

		
		Propietario Propietariov2 = new Propietario("Pepe", "Martínez", "56746789F");
		Vehiculo v2 = new Vehiculo("Audi", "4567FGH", 3500, LocalDate.of(2015, 10, 20), 42500 , "blanco", Propietariov2);
		System.out.println("Información del segundo vehículo: ");
		v2.mostrarInfo();
		
		

	}

}
