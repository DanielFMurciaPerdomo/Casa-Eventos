package co.edu.utadeo.modelos;

public class Empleado {

	private String carne, nombre, celular, pago, universidad, carrera;
	private int codevento;

	

	public Empleado(String carne, String nombre, String celular, String pago, String universidad, String carrera,
			int codevento) {
		super();
		this.carne = carne;
		this.nombre = nombre;
		this.celular = celular;
		this.pago = pago;
		this.universidad = universidad;
		this.carrera = carrera;
		this.codevento = codevento;
	}

	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getPago() {
		return pago;
	}

	public void setPago(String pago) {
		this.pago = pago;
	}

	public int getCodevento() {
		return codevento;
	}

	public void setCodevento(int codevento) {
		this.codevento = codevento;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
	
}