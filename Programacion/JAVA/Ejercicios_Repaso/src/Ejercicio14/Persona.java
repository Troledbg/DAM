package Ejercicio14;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private String apellidos;
	private LocalDate feNacimiento;
	private String DNI;
	private static int ID;
	
	public Persona(String nombre, String apellidos, LocalDate feNacimiento, String DNI) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.feNacimiento = feNacimiento;
		this.DNI = DNI;
	}
	
	public String dameNombre() {
		return this.nombre;
	}
	public void modificaNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String dameApellidos () {
		return this.apellidos;
	}
	public void modificaApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public LocalDate dameFeNacimiento() {
		return this.feNacimiento;
	}
	public void modificaFeNacimiento(LocalDate feNacimiento) {
		this.feNacimiento = feNacimiento;
	}
	//apellidos, feNacimiento, DNI
}
