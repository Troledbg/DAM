package Ejercicio04;

public class Circulo {

	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double dameRadio() {
		return this.radio;
	}
	public void modificaRadio(double radio) {
		this.radio = radio;
	}
	
	public double area() {
		/*La constante Math.PI nos proporciona el valor del número pi
		 * El método pow() nos permite elevar un número a un exponente,
		 * en este caso estamos calculadno radio^2, el exponente sería 2*/
		return Math.PI * Math.pow(this.radio, 2);
	}
	
	public void mostrarInfo() {
		System.out.println("Las características del círculo son: ");
		System.out.println("Radio: "+this.radio+"cm");
		System.out.println("Área: "+String.format("%.2f", this.area()));
		//String.format ("%.2f, xxxx") Sirve para que solo nos muestre 2 decimales
	}
	
	public String toString() {
		return "Las características del círculo son: \n"
				+"\tRadio: "+this.radio+"cm\n"
				+"\tÁrea: "+String.format("%.2f", this.area());
	}
}
