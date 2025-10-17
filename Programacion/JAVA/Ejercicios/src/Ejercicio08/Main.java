package Ejercicio08;

import Ejercicio07.Bombilla;

public class Main {

	public static void main(String[] args) {
		Bombilla bombilla1 = new Bombilla();
		
		Bombilla.activaGeneral();
		bombilla1.enciendeBombilla();
		
		Lampara lampara1 = new Lampara(bombilla1,"");
		System.out.print(lampara1.toString());
		
		lampara1.cambiarTipo("flexo");
		System.out.print(lampara1.toString());
		
	}

}
