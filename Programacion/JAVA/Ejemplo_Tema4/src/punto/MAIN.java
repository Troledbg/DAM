
package punto;

public class MAIN {

	public static void main(String[] args) {
		PUNTO punto1 = new PUNTO(2, 2);
		
		int valorX = punto1.dameX();
		System.out.println("El valor de las coordenadas inicialmente son:");
		System.out.println("La coordenada X vale: " + valorX);
		int valorY = punto1.dameY();
		System.out.println("La coordenada Y vale: " + valorY);
		System.out.println();
		System.out.println("El valor de las coordenadas desplazadas son:");
		punto1.desplazar(3, 1);
		System.out.println("La coordenada X vale: " + punto1.dameX());
		System.out.println("La coordenada Y vale: " + punto1.dameY());
		System.out.println("El valor de las coordenadas modificadas son:");
		punto1.modificaX(8);
		punto1.modificaY(10);
		System.out.println("La coordenada X modificada vale: " + punto1.dameX());
		System.out.println("La coordenada Y modificada vale: " + punto1.dameY());

	}

}
