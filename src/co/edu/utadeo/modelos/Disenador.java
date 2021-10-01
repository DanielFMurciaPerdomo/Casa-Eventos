package co.edu.utadeo.modelos;

public class Disenador {
	String nombre, pasaporte, origen, foto;
	int codDesfile;

	public Disenador(String nombre, String pasaporte, String origen, String foto, int codDesfile) {
		super();
		this.nombre = nombre;
		this.pasaporte = pasaporte;
		this.origen = origen;
		this.foto = foto;
		this.codDesfile = codDesfile;
	}

	public  String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getCodDesfile() {
		return codDesfile;
	}

	public void setCodDesfile(int codDesfile) {
		this.codDesfile = codDesfile;
	}

	@Override
	public String toString() {
		return "Disenador [nombre=" + nombre + ", pasaporte=" + pasaporte + ", origen=" + origen + ", foto=" + foto
				+ ", codDesfile=" + codDesfile + "]";
	}
			
}
