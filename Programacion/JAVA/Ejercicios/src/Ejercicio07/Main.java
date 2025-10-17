package Ejercicio07;

public class Main {

	public static void main(String[] args) {
		Bombilla b1 = new Bombilla();
		
		
		Bombilla.activaGeneral();
		b1.enciendeBombilla();
		System.out.println(b1.encendido() ? "SI" : "NO");
		
		Bombilla.desactivaGeneral();
		System.out.print(b1.encendido() ? "SI" : "NO");
	}

}
