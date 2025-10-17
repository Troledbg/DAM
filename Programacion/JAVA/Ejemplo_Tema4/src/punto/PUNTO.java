package punto;

public class PUNTO {

	// (es la plantilla que usamos para crear un objeto llamado punto)
	private int x; // atributos
	private int y;

	// constructor
	public PUNTO(int x, int y) {
		this.x = x; // hacemos referencia al atributo de la clase llamado X
		this.y = y;
	}

	// metodo desplaza
	public void desplazar(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public int dameX() {
		return x;
	}

	public void modificaX(int x) {
		this.x = x;
	}

	// aqui estamos llamando al metodo de dameY y como tiene que devolver un tipo de
	// dato entero por eso ponemos int, y para que lo devuelva ponemos return
	public int dameY() {
		return y;
	}

	// es un metodo vacio cuando ponemos void
	public void modificaY(int y) {
		this.y = y;
	}

	public void mostrarPantalla() {
		System.out.println("Las coordenadas del PUNTO son:" + "\n" + "\t La coordenada X es: " + this.x + "\n"
				+ "\t La coordenada Y es: " + this.y);
	}

}
