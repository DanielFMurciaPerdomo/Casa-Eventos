package co.edu.utadeo.modelos;

public class AContrato extends Artista {
	
	private String tipo;
	private String pago;
	private int codDesfile;

	public AContrato(long codigo, String nombre, String genero, String tipo, String pago, int codDesfile) {
		super(codigo, nombre, genero);
		this.tipo = tipo;
		this.pago = pago;
		this.codDesfile = codDesfile;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPago() {
		return pago;
	}

	public void setPago(String pago) {
		this.pago = pago;
	}

	public int getCodDesfile() {
		return codDesfile;
	}

	public void setCodDesfile(int codDesfile) {
		this.codDesfile = codDesfile;
	}
	
	
	
}