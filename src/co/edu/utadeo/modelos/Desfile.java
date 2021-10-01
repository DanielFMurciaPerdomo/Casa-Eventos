package co.edu.utadeo.modelos;

public class Desfile {

	private int numero;
	private Fecha fecha;
	private Hora hora;
	private String nombre, foto;
	private int codevento;
	
	public Desfile(int numero, Fecha fecha, Hora hora, String nombre, String foto, int codevento) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.hora = hora;
		this.nombre = nombre;
		this.foto = foto;
		this.codevento = codevento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	public Hora getHora() {
		return hora;
	}
	public void setHora(Hora hora) {
		this.hora = hora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodevento() {
		return codevento;
	}
	public void setCodevento(int codevento) {
		this.codevento = codevento;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	@Override
	public String toString() {
		return "Desfile [numero=" + numero + ", fecha=" + fecha + ", hora=" + hora + ", nombre=" + nombre
				+ ", codevento=" + codevento + "]";
	}
	
	
	
	
}
