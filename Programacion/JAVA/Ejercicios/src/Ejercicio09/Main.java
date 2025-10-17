package Ejercicio09;

public class Main {

	public static void main(String[] args) {
		Coche coche1 = new Coche("Audi","Rojo",140,4,2021,"Electrico");
        Coche coche2 = new Coche("Mercedes","gris",120,3,2022,"gasoil");
        Coche coche3 = new Coche("Peugeot","Azul Marino",115,5,2018,"Gasolina");
        
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
        System.out.println(coche3.toString());

	}

}
