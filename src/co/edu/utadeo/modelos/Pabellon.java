package co.edu.utadeo.modelos;

public class Pabellon {

	private String nombre, telefono, foto, codEmp;
	private int codDesfile;
	
	public Pabellon(String nombre, String telefono, String foto, String codEmp, int codDesfile) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.foto = foto;
		this.codEmp = codEmp;
		this.codDesfile = codDesfile;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getCodEmp() {
		return codEmp;
	}
	public void setCodEmp(String codEmp) {
		this.codEmp = codEmp;
	}
	public int getCodDesfile() {
		return codDesfile;
	}
	public void setCodDesfile(int codDesfile) {
		this.codDesfile = codDesfile;
	}
	
	
}
