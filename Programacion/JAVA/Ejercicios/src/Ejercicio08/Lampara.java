package Ejercicio08;

import Ejercicio07.Bombilla;

public class Lampara {

		private Bombilla bombilla;
		private String tipo;
		
		public Lampara (Bombilla a, String b) {
			this.bombilla = a;
			this.tipo = "pie";
		}
		
		public void encenderLampara() {
			this.bombilla.enciendeBombilla();
		}
		public void apagarLampara() {
			this.bombilla.apagaBombilla();
		}
		public void cambiarTipo(String tipo) {
			this.tipo = tipo;
		}
		public void mostrarLampara() {
			System.out.print("Lampara: \n"
					+ "Tipo de Lámpara: "+this.tipo+"\n"
					+ "Encendida? "+this.bombilla.encendido());
		}
		
		public String toString() {
			return "Lampara: \n"
					+"\tTipo de Lámpara: "+this.tipo+"\n"
					+"\tEncendida? "+(this.bombilla.encendido() ? "SI" : "NO");
		}
	
}
