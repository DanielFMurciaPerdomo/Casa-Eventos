package co.edu.utadeo.modelos;

public abstract class Artista {
	
	private long codigo;
	private String nombre;
	private String genero;
		
	public Artista(long codigo, String nombre, String genero) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.genero = genero;
	}
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
		
}