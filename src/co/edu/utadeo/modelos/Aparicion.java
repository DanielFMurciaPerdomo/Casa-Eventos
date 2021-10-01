package co.edu.utadeo.modelos;

public class Aparicion {

	private String modelo, pasaporte, arriba, abajo, desfile;

	public Aparicion(String modelo, String pasaporte, String arriba, String abajo, String desfile) {
		super();
		this.modelo = modelo;
		this.pasaporte = pasaporte;
		this.arriba = arriba;
		this.abajo = abajo;
		this.desfile = desfile;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getArriba() {
		return arriba;
	}

	public void setArriba(String arriba) {
		this.arriba = arriba;
	}

	public String getAbajo() {
		return abajo;
	}

	public void setAbajo(String abajo) {
		this.abajo = abajo;
	}

	public String getDesfile() {
		return desfile;
	}

	public void setDesfile(String desfile) {
		this.desfile = desfile;
	}
	
	
}
