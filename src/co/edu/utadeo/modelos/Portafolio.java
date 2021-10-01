package co.edu.utadeo.modelos;

public class Portafolio {

	private int codigo;
	private String estilo, foto, anio, pasaporte;
	public Portafolio(int codigo, String estilo, String foto, String anio, String pasaporte) {
		super();
		this.codigo = codigo;
		this.estilo = estilo;
		this.foto = foto;
		this.anio = anio;
		this.pasaporte = pasaporte;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}
	
	
}
