package Ejercicio13;

import java.time.LocalDate;
import java.time.Period;

public class Vehiculo {
	
	private String marca;
	private String matricula;
	private int numKm;
	private LocalDate fechaMatriculacion;
	private int precio;
	private String color;
	private Propietario propietarioVehiculo;
	
	
	public Vehiculo(String marca, String matricula, int numKm, LocalDate fechaMatriculacion, int precio, String color, Propietario PropietarioVehiculo) {
		this.marca = marca;
		this.matricula = matricula;
		this.numKm = numKm;
		this.fechaMatriculacion = fechaMatriculacion;
		this.precio = precio;
		this.color = color;
		this.propietarioVehiculo = PropietarioVehiculo;
	}
	public Vehiculo() {
		this.marca = "Peugeot";
		this.matricula = "7894MKJ";
		this.numKm = 14500;
		this.fechaMatriculacion = LocalDate.of(2019, 11, 15);
		this.precio = 21500;
		this.color = "negro";
		this.propietarioVehiculo = null;
	}
	

	public String dameMarca() {
		return marca;
	}

	public void modificaMarca(String marca) {
		this.marca = marca;
	}

	public String dameMatricula() {
		return matricula;
	}

	public void modificaMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int dameNumKm() {
		return numKm;
	}

	public void modificaNumKm(int numKm) {
		this.numKm = numKm;
	}

	public LocalDate dameFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void modificaFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public int damePrecio() {
		return precio;
	}

	public void modificaPrecio(int precio) {
		this.precio = precio;
	}

	public String dameColor() {
		return color;
	}

	public void modificaColor(String color) {
		this.color = color;
	}

	public Propietario damePropietarioVehiculo() {
		return propietarioVehiculo;
	}

	public void modificaPropietarioVehiculo(Propietario propietarioVehiculo) {
		this.propietarioVehiculo = propietarioVehiculo;
	}
	
	public int dameAnio() {
		
		LocalDate f1 = this.fechaMatriculacion;
		LocalDate f2 = LocalDate.now();
		
		Period p = Period.between(f1, f2);//between devuelve la resta entre las 2 fechas y la guarda en la variable period
		return p.getYears();
	}
	
	public void mostrarInfo() {
		System.out.print("PROPIETARIO: \n"
						+"\tMarca: "+this.marca+"\n"
						+"\tMatricula: "+this.matricula+"\n"
						+"\tNúmero de KM: "+this.numKm+"\n"
						+"\tFecha de Matriculación: "+this.fechaMatriculacion+"\n"
						+"\tColor: "+this.color+"\n"
						+"\tPrecio "+this.precio+"\n");
						this.propietarioVehiculo.MostrarInfo();
	}
	
	public String dameVehiculo() {
		return "PROPIETARIO: \n"
				+"\tMarca: "+this.marca+"\n"
				+"\tMatricula: "+this.matricula+"\n"
				+"\tNúmero de KM: "+this.numKm+"\n"
				+"\tFecha de Matriculación: "+this.fechaMatriculacion+"\n"
				+"\tColor: "+this.color+"\n"
				+"\tPrecio "+this.precio+"\n"
				+ propietarioVehiculo.toString();
	}
	
	
}
