package Ejercicios03;

public class Mesa {

	private double alto;
	private double ancho;
	private double largo;
	private String color;
	private String material;
	
	public Mesa () {
		this.alto = 80;
		this.ancho = 120;
		this.largo = 60;
		this.color = "negro";
		this.material = "madera";
	}
	public Mesa (double alto, double ancho, double largo) {
		this.alto = 80;
		this.ancho = 120;
		this.largo = 60;
		this.color = "negro";
		this.material = "hierro";
	}
	public Mesa (double alto, double ancho, double largo, String color, String material) {
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
		this.color = color;
		this.material = material;
	}
	
	public void cambiarColor(String color) {
		this.color = color;
	}
	public void dameColor (String color) {
		this.color = color;
	}
	public void mostrarColor (String color) {
		this.color = color;
	}
	public double dameAlto() {
		return alto;
	}
	public void modificaAlto(double alto) {
		this.alto = alto;
	}
	public double dameAncho() {
		return ancho;
	}
	public void modificaAncho(double ancho) {
		this.ancho = ancho;
	}
	public double dameLargo() {
		return largo;
	}
	public void modificaLargo(double largo) {
		this.largo = largo;
	}
	public String dameMaterial() {
		return material;
	}
	public void modificaMaterial(String material) {
		this.material = material;
	}
	
	public void mostrarInfo() {
		System.out.print("Mesa: \n"
				+ "\tAlto: "+this.alto+"\n"
				+ "\tAncho:"+this.ancho+"\n"
				+ "\tLargo: "+this.largo+"\n"
				+ "\tColor: "+this.color+"\n"
				+ "\tMaterial: "+this.material);
	}
	
	public String toString() {
		return "Mesa: \n"
				+ "\tAlto: "+this.alto+"\n"
				+ "\tAncho:"+this.ancho+"\n"
				+ "\tLargo: "+this.largo+"\n"
				+ "\tColor: "+this.color+"\n"
				+ "\tMaterial: "+this.material;
	}
	
	
	
	
}
