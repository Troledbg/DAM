package perro;

public class Perro {

	/*
	 * String: se usa cuando los carácteres que hay que introducir es texto, Int: se
	 * usa para introducir número enteros
	 */

	private String raza;
	private String pelaje;
	private String nombre;
	private int numPatas;
	private double longitud;
	
	
	// Constructor
	public Perro(String raza, String pelaje, String nombre, int numPatas, double longitud) {

		// Asignamos a cada atributo su valor/parámetro
		this.raza = raza;
		this.pelaje = pelaje;
		this.nombre = nombre;
		this.numPatas = numPatas;
		this.longitud = longitud;
	}

	//
	public String dameRaza() {
		return this.raza;
	}

	public void modificaRaza(String raza) {
		this.raza = raza;
	}

	public String damePelaje() {
		return this.pelaje;
	}

	public void modificaPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public String dameNombre() {
		return this.nombre;
	}

	public void modificaNombre(String nombre) {
		this.nombre = nombre;
	}

	public int dameNumPatas() {
		return this.numPatas;
	}

	public void modificaNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public double dameLongitud() {
		return this.longitud;
	}

	public void modificaLongitud(double longitud) {
		this.longitud = longitud;
	}

	
	
	public void ladrar() {
		System.out.println("El perro " + this.nombre + " está ladrando...");
	}

	public void caminar() {
		System.out.println("El perro " + this.nombre + " está caminando...");
	}

	
	public String toString() {
		return "PERRO: \n"
						+ "\t\tNombre: " + this.nombre + "\n" 
						+ "\t\tRaza: " + this.raza + "\n" 
						+ "\t\tPelaje: " + this.pelaje + "\n" 
						+ "\t\tNúmero de patas: " + this.numPatas + "\n" 
						+ "\t\tLongitud: " + this.longitud + "\n" + "\n";
	}
	
	public void mostrarInfo() {
		System.out.print("PERRO: \n"
						+ "\tNombre: " + this.nombre + "\n" 
						+ "\tRaza: " + this.raza + "\n" 
						+ "\tPelaje: " + this.pelaje + "\n" 
						+ "\tNúmero de patas: " + this.numPatas + "\n" 
						+ "\tLongitud: " + this.longitud + "\n" + "\n");

	}

}
