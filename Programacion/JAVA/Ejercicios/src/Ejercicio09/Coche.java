package Ejercicio09;

public class Coche {

	private String marca;
	private String color;
	private int cv;
	private int numPuertas;
	private int anoFabricacion;
	private String tipoMotor;
	private int fecha;
	private boolean garantia;
	private int ANOS_GARANTIA = 5;
	
	public Coche (String marca, String color, int cv, int numPuertas, int anoFabricacion, String tipoMotor) {
		this.marca = marca;
		this.color = color;
		this.cv = cv;
		this.numPuertas = numPuertas;
		this.anoFabricacion = anoFabricacion;
		this.tipoMotor = tipoMotor;
	}
	
	public Coche () {
		this.marca = "Ford";
		this.color = "Blanco";
		this.cv = 150;
		this.numPuertas = 5;
		this.anoFabricacion = 2019;
		this.tipoMotor = "gasoil";
	}
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getCv() {
		return this.cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	
	public int getNumPuertas() {
		return this.numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	public int getAnoFabricacion() {
		return this.anoFabricacion;
	}
	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}
	
	public String getTipoMotor() {
		return this.tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	
	public int getFecha() {
		return this.fecha;
	}
	public void setFeha(int fecha) {
		this.fecha = fecha;
	}
	public boolean garantia() {
		int anoActual = 2025;
		if (anoActual - this.anoFabricacion <= ANOS_GARANTIA)
		return true;
		else
		return false;
	}
	
	
	public String toString() {
		return "COCHE: \n"
				+ "\tMarca: "+this.marca+"\n"
				+ "\tColor: "+this.color+"\n"
				+ "\tCV: "+this.cv+"\n"
				+ "\tNúmero Puertas: "+this.numPuertas+"\n"
				+ "\tAño Fabricacion: "+this.anoFabricacion+"\n"
				+ "\tMotor: "+this.tipoMotor+"\n"
				+ "\tTiene Garantía? "+(garantia()? "SI" : "NO");
	}
	
}
