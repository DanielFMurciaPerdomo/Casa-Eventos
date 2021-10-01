package co.edu.utadeo.modelos;

public class Historico {
	private String peso, busto, cintura, estatura, calzado, anio, particularidades, pasaporte;

	public Historico(String peso, String busto, String cintura, String estatura, String calzado, String anio,
			String particularidades, String pasaporte) {
		super();
		this.peso = peso;
		this.busto = busto;
		this.cintura = cintura;
		this.estatura = estatura;
		this.calzado = calzado;
		this.anio = anio;
		this.particularidades = particularidades;
		this.pasaporte = pasaporte;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getBusto() {
		return busto;
	}

	public void setBusto(String busto) {
		this.busto = busto;
	}

	public String getCintura() {
		return cintura;
	}

	public void setCintura(String cintura) {
		this.cintura = cintura;
	}

	public String getEstatura() {
		return estatura;
	}

	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}

	public String getCalzado() {
		return calzado;
	}

	public void setCalzado(String calzado) {
		this.calzado = calzado;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getParticularidades() {
		return particularidades;
	}

	public void setParticularidades(String particularidades) {
		this.particularidades = particularidades;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}
	
	

}
