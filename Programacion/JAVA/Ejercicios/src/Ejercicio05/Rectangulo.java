package Ejercicio05;

import Ejercicio01.Punto;

public class Rectangulo {

		private Punto punto1;
		private Punto punto2;
		private Punto punto3;
		private Punto punto4;
		
		public Rectangulo (Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
			this.punto1 = punto1;
			this.punto2 = punto2;
			this.punto3 = punto3;
			this.punto4 = punto4;
		}
		
		public Rectangulo (int base, int altura) {
			this.punto1 = new Punto(0,0);
			this.punto2 = new Punto(base,0);
			this.punto3 = new Punto(base, altura);
			this.punto4 = new Punto(0, altura);
		}
		
		public void desplazaPunto1 (int dx, int dy) {
			this.punto1.desplaza(dx, dy);
			this.punto2.desplaza(dx, dy);
			this.punto3.desplaza(dx, dy);
			this.punto4.desplaza(dx, dy);
		}
		
		public void mostrarCoordenadas () {
			System.out.print("");
		}
}
