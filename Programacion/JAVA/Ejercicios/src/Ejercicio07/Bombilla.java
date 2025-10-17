package Ejercicio07;

public class Bombilla {

	private static boolean iGeneral;
	private boolean iBombilla;

	public static void activaGeneral() {
		iGeneral = true;
	}

	public static void desactivaGeneral() {
		iGeneral = false;
	}

	public void enciendeBombilla() {
		this.iBombilla = true;
	}

	public void apagaBombilla() {
		this.iBombilla = false;
	}

	public boolean encendido() {
		// return iGeneral && this.iBombilla;
		if (iGeneral == true && this.iBombilla == true)
			return true;
		else
			return false;
	}

}
