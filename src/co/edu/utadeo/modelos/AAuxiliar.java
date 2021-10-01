package co.edu.utadeo.modelos;

import java.util.Date;

public class AAuxiliar extends Artista {
	
	private Fecha creacion;
	private int cogDesfile;

	public AAuxiliar(long codigo, String nombre, String genero, Fecha creacion, int codDesfile) {
		super(codigo, nombre, genero);
		this.creacion = creacion;
		this.cogDesfile = codDesfile;
	}

	public Fecha getCreacion() {
		return creacion;
	}

	public void setCreacion(Fecha creacion) {
		this.creacion = creacion;
	}

	public int getCogDesfile() {
		return cogDesfile;
	}

	public void setCogDesfile(int cogDesfile) {
		this.cogDesfile = cogDesfile;
	}


	
}