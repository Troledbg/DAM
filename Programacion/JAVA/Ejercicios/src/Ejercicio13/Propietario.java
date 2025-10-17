package Ejercicio13;

public class Propietario {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private int IdTrabajador;
	private static int contador = 0;


	public Propietario (String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		contador++;
		this.IdTrabajador = contador;
	}
	
	public Propietario () {
		contador++;
		this.nombre = "Pepe";
		this.apellidos = "López Sánchez";
		this.dni = "78985567L";
		this.IdTrabajador = contador;
	}
	
	public String DameNombre() {
		return this.nombre;
	}
	public void ModificaNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String DameApellidos() {
		return this.apellidos;
	}
	public void ModificaApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String DameDni() {
		return this.dni;
	}
	public void ModificaDni(String dni) {
		this.dni = dni;
	}
	
	public int DameIdTrabajador() {
		return this.IdTrabajador;
	}
	
	public void MostrarInfo() {
		System.out.print("PROPIETARIO: \n"
						+"\tNombre: "+this.nombre+"\n"
						+"\tApellidos: "+this.apellidos+"\n"
						+"\tDNI: "+this.dni+"\n"
						+"\tID Trabajador: "+this.IdTrabajador+"\n");
	}
	
	public String toString() {
		return "PROPIETARIO: \n"
				+"\tNombre: "+this.nombre+"\n"
				+"\tApellidos: "+this.apellidos+"\n"
				+"\tDNI: "+this.dni+"\n"
				+"\tID Trabajador: "+this.IdTrabajador+"\n";
	}
}

