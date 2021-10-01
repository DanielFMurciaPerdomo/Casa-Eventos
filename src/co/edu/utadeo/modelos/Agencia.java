package co.edu.utadeo.modelos;

public class Agencia {
	private String nombre, sede, email, nameOwner, foto, codigo, yearCreation, codmodelo;
	
	public Agencia(String nombre, String sede, String email, String nameOwner, String foto, String codigo,
			String yearCreation, String codmodelo) {
		super();
		this.nombre = nombre;
		this.sede = sede;
		this.email = email;
		this.nameOwner = nameOwner;
		this.foto = foto;
		this.codigo = codigo;
		this.yearCreation = yearCreation;
		this.codmodelo = codmodelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNameOwner() {
		return nameOwner;
	}

	public void setNameOwner(String nameOwner) {
		this.nameOwner = nameOwner;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getYearCreation() {
		return yearCreation;
	}

	public void setYearCreation(String yearCreation) {
		this.yearCreation = yearCreation;
	}

	public String getCodmodelo() {
		return codmodelo;
	}

	public void setCodmodelo(String codmodelo) {
		this.codmodelo = codmodelo;
	}

	@Override
	public String toString() {
		return "Agencia [nombre=" + nombre + ", sede=" + sede + ", email=" + email + ", nameOwner=" + nameOwner
				+ ", foto=" + foto + ", codigo=" + codigo + ", yearCreation=" + yearCreation + "]";
	}
	
}
