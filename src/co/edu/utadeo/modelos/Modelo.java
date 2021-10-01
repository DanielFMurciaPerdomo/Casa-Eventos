package co.edu.utadeo.modelos;

public class Modelo {
	
	private String pasaporte, pais, nombre, pago, foto;
	private Fecha fechaNacimiento;
	private int codDesfile;
	public Modelo(String pasaporte, String pais, String nombre, String pago, String foto, Fecha fechaNacimiento,
			int codDesfile) {
		super();
		this.pasaporte = pasaporte;
		this.pais = pais;
		this.nombre = nombre;
		this.pago = pago;
		this.foto = foto;
		this.fechaNacimiento = fechaNacimiento;
		this.codDesfile = codDesfile;
	}
	public String getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPago() {
		return pago;
	}
	public void setPago(String pago) {
		this.pago = pago;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getCodDesfile() {
		return codDesfile;
	}
	public void setCodDesfile(int codDesfile) {
		this.codDesfile = codDesfile;
	}
	
}

