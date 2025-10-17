package perro;

public class Main {

	public static void main(String[] args) {

		// Esto es para meterle información a los perros
		Perro perro1 = new Perro("Pastor Alemán", "Denso", "Rocky", 4, 1.2);
		Perro perro2 = new Perro("Bulldog", "Liso", "Rayo", 4, 0.88);
		Perro perro3 = new Perro("Golden Retriever", "Suave", "Kakao", 3, 1.2);
		perro1.mostrarInfo();
		perro2.mostrarInfo();
		perro3.mostrarInfo();

		perro1.modificaLongitud(1.5);
		perro1.mostrarInfo();

		perro2.modificaPelaje("rizado");
		perro2.mostrarInfo();

		perro3.modificaNombre("Messi");
		perro3.mostrarInfo();

		perro1.ladrar();
		perro2.caminar();
		perro3.ladrar();

		// almacenar información en variables
		String nombre1 = perro1.dameNombre();
		System.out.println("El nombre del perro1 es: " + nombre1);
		double longitud2 = perro2.dameLongitud();
		System.out.println("La longitud del perro2 es: " + longitud2);
		int numPatas3 = perro3.dameNumPatas();
		System.out.println("El número de patas del perro3 es: " + numPatas3);

		// En este no es necesario poner los datos, porque ya los hemos declarado en
		// Persona
		// Aquí le estamos asignando una mascota a la persona1
		Persona persona1 = new Persona();
		persona1.modificaMascota(perro1);

		Persona persona2 = new Persona("Antonio", "9876543B", perro2, 30);

		persona1.mostrarInfo();
		System.out.println("Información con método ToString()");
		System.out.print(persona1.toString());
		persona2.modificaMascota(perro2);
		System.out.println("Información con método ToString()");
		System.out.print(persona2.toString());
	}
}
