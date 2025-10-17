package Ejercicio10;

public class Empleado {

	private String dni;
	private String nombre;
	private int edad;
	private boolean teletrabajo;
	private int salarioTotal;
	private static int SALARIOBASE = 1000;
	private int calculaSueldo;
	
	public Empleado (String dni, String nombre, int edad, boolean teletrabajo) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.teletrabajo = teletrabajo;
	}
	
	public String dameDNI() {
		return this.dni;
	}
	public void modificaDNI(String dni) {
		this.dni = dni;
	}
	
	public String dameNombre() {
		return this.nombre;
	}
	public void modificaNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int dameEdad() {
		return this.edad;
	}
	public void modificaEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean dameTeletrabajo() {
		return this.teletrabajo;
	}
	public void modificaTeletrabajpo(boolean teletrabajo) {
		this.teletrabajo = teletrabajo;
	}
	
	public int dameSalarioTotal() {
		return this.salarioTotal;
	}
	public void modificaSalarioTotal(int salarioTotal) {
		this.salarioTotal = salarioTotal;
	}
	
	
	public String toString() {
		return "EMPLEADO: \n"
				+"\tDNI: "+this.dni+"\n"
				+"\tNombre: "+this.nombre+"\n"
				+"\tEdad: "+this.edad+"\n"
				+"\tTeletrabaja? "+this.teletrabajo+"\n"
				+"\tSalario Total: "+this.salarioTotal+"\n";
	}
	public void calculaSueldo() {
		if (this.edad >= 30 && this.teletrabajo == true) {
			this.salarioTotal = SALARIOBASE + 200 + 30;
		}
		else if(this.edad >= 30){
			this.salarioTotal = SALARIOBASE + 200;
		}
		else if(this.teletrabajo == true){
			this.salarioTotal = SALARIOBASE + 30;
		}
		else {
			this.salarioTotal = SALARIOBASE;
		}
	}
}
