package co.edu.utadeo.modelos;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Evento {
	//Atributos
	private int codigo;
	private String nombre, foto;
	private Fecha inicio, fin;
	
	//Constructor
	public Evento(int codigo, String nombre, String foto, Fecha inicio, Fecha fin) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.foto = foto;
		this.inicio = inicio;
		this.fin = fin;
	}
	
	public Evento() {
		
	}
	
	//Getters y Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Fecha getInicio() {
		return inicio;
	}
	public void setInicio(Fecha inicio) {
		this.inicio = inicio;
	}
	public Fecha getFin() {
		return fin;
	}
	public void setFin(Fecha fin) {
		this.fin = fin;
	}
	@Override
	public String toString() {
		return "Evento [codigo=" + codigo + ", nombre=" + nombre + ", foto=" + foto + ", inicio=" + inicio + ", fin="
				+ fin + "]";
	}
		
	
}
