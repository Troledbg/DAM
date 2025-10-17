package Ejercicio10;

public class Empresa {
	
	private String CIF;
	private String nombre;
	private Empleado empleadoEmpresa;
	
	public Empresa(String CIF, String nombre, Empleado empleadoEmpresa) {
	this.CIF = CIF;
	this.nombre = nombre;
	this.empleadoEmpresa = empleadoEmpresa;
	}
	
	public void mostrarInfo() {
		System.out.print("EMPRESA: \n"
				+"\tCIF: "+this.CIF+"\n"
				+"\tNombre: "+this.nombre+"\n"
				+"\tEmpleado: "+this.empleadoEmpresa.toString()+"\n");
	}
}
