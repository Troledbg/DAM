package Ejercicio01;

public class Punto {
//Atributos privados
	private int x;
	private int y;
//Constructor con parámetros	
public Punto(int x, int y) {
	this.x = x;
	this.y = y;
}
//Constructor sin parámetros
public Punto() {
	this.x = 0;
	this.y = 0;
}

public int dameX() {
	return this.x;
}
public void modificaX(int x) {
	this.x = x;
}

public int dameY() {
	return this.y;
}
public void modificaY(int y) {
	this.y = y;
}

public void desplaza(int dx, int dy) {
	this.x = dx;
	this.y = dy;
}

public void desplaza(int desplazamiento) {
	this.x += desplazamiento;
	this.y += desplazamiento;
}

public void mostrarCoordenadas() {
	System.out.print("PUNTO: ("+this.x+", "+this.y+")");
}

	public String toString() {
		return "\tX: "+ this.x +"\n"
				+"\tY: "+ this.y +"\n";
	}
}
