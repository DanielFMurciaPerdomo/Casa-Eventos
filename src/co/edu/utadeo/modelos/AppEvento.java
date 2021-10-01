package co.edu.utadeo.modelos;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AppEvento {

	public ArrayList<Evento>lstEvento = new ArrayList<Evento>();
	public ArrayList<Desfile>lstDesfile = new ArrayList<Desfile>();
	public ArrayList<Empleado>lstEmpleado = new ArrayList<Empleado>();
	public ArrayList<Disenador> lstDisenador = new ArrayList<Disenador>();
	public ArrayList<Agencia> lstAgencias = new ArrayList<Agencia>();
	public ArrayList<Pabellon> lstPabellon = new ArrayList<Pabellon>();
	public ArrayList<Modelo> lstModelo = new ArrayList<Modelo>();
	public ArrayList<Historico> lstHistorico = new ArrayList<Historico>();
	public ArrayList<AContrato> lstAContrato = new ArrayList<AContrato>();
	public ArrayList<AAuxiliar> lstAAuxiliar = new ArrayList<AAuxiliar>();
	public ArrayList<Portafolio> lstPortafolio = new ArrayList<Portafolio>();
	public ArrayList<Aparicion> lstApariciones = new ArrayList<Aparicion>();
	
	public AppEvento() {
		super();
	}


	public void cargarEvento() {
		String archivoEntrada = "Datos/Eventos.txt";
		try {
			Scanner entrada = new Scanner(new File(archivoEntrada));
			
			while(entrada.hasNext()) {
				String registro = entrada.nextLine();
				String[] campos = registro.split(";");
				int codigo = Integer.parseInt(campos[0]);
				String nombre = campos[1];
				String foto = campos[2];
				
				int dia = Integer.parseInt(campos[3]);
				int mes = Integer.parseInt(campos[4]);
				int anio = Integer.parseInt(campos[5]);
				
				int dia1 = Integer.parseInt(campos[6]);
				int mes1 = Integer.parseInt(campos[7]);
				int anio1 = Integer.parseInt(campos[8]);
				
				
				
				Fecha inicio = new Fecha(dia, mes, anio);
				Fecha fin = new Fecha(dia1, mes1, anio1);
				
				Evento evento = new Evento(codigo, nombre, foto, inicio, fin);
				lstEvento.add(evento);
				
			}
			entrada.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al cargar los eventos");
		}
	}
	
	public void cargarDesfile() {
		String archivoEntrada = "Datos/Desfiles.txt";
		
		try {
			Scanner entrada = new Scanner(new File(archivoEntrada));
			
			while(entrada.hasNext()) {
				String registro = entrada.nextLine();
				String[] campos = registro.split(";");
				int numero = Integer.parseInt(campos[0]);
				
				int dia = Integer.parseInt(campos[1]);
				int mes = Integer.parseInt(campos[0]);
				int anio = Integer.parseInt(campos[3]);
				Fecha fecha = new Fecha(dia, mes, anio);
				
				int hh = Integer.parseInt(campos[4]);
				int mm = Integer.parseInt(campos[5]);
				int ss = Integer.parseInt(campos[6]);
				Hora hora = new Hora(hh, mm, ss);
				
				String nombre = campos[7];
				String foto = campos[8];
				int codevento = Integer.parseInt(campos[9]);
				
				Desfile desfile = new Desfile(numero, fecha, hora, nombre, foto, codevento);
				lstDesfile.add(desfile);
			}
			entrada.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al cargar los desfiles");
		}
	}
	
	public void cargarEmpleados() {
		String archivoEntrada = "Datos/Empleados.txt";
		
		try {
			Scanner entrada = new Scanner(new File(archivoEntrada));
			while(entrada.hasNext()) {
				String registro = entrada.nextLine();
				String[]campos=registro.split(";");
				
				String carne = campos[0];
				String nombre = campos[1];
				String numero=campos[2];
				String pago = campos[3];
				
				String universidad = campos[4];
				String carrera = campos[5];

				int codevento = Integer.parseInt(campos[6]);
												
				Empleado empleado = new Empleado(carne, nombre, numero, pago, universidad, carrera, codevento);
				lstEmpleado.add(empleado);
			}
			entrada.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al cargar los empleados");
		}
	}
	
	public void cargarDisenadores() {
		String archivoEntrada = "Datos/Disenadores.txt";
		
		try {
			Scanner entrada = new Scanner (new File(archivoEntrada));
			
			while(entrada.hasNext()) {
				String registro = entrada.nextLine();
				String [] campos = registro.split(";");
				
				String nombre = campos[0];
				String pasaporte = campos[1];
				String pais = campos[2];
				String foto = campos[3];
				int coddes = Integer.parseInt(campos[4]);
				
				Disenador disenador = new Disenador(nombre, pasaporte, pais, foto, coddes);
				lstDisenador.add(disenador);
			}
			entrada.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al cargar los Diseñadores");
		}
	}
	
	public void cargarAgencia() {
		String archivoEntrada = "Datos/Agencias.txt";
		
		try {
			Scanner entrada = new Scanner(new File(archivoEntrada));
			
			while(entrada.hasNext()) {
				String registro = entrada.nextLine();
				String [] campos = registro.split(";");
				// String nombre, String sede, String email, String nameOwner, String foto, String codigo,
				//String yearCreation
				String nombre = campos[0];
				String sede = campos[1];
				String email = campos[2];
				String nameOwner = campos[3];
				String foto = campos[4];
				String codigo = campos[5];
				String yearCreation = campos[6];
				String codmodelo = campos[7];
				
				Agencia agencia = new Agencia(nombre, sede, email, nameOwner, foto, codigo, yearCreation, codmodelo);
				lstAgencias.add(agencia);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al cargar las agencias");
		}
	}
	
	public void cargarPabellon() {
		String archivoEntrada = "Datos/Pabellones.txt";
		
		try {
			Scanner entrada = new Scanner(new File(archivoEntrada));
			
			while(entrada.hasNext()) {
				String registro = entrada.nextLine();
				String [] campos = registro.split(";");
				// String nombre, String telefono, String foto, int codEmp, int codDesfile
				String nombre = campos[0];
				String telefono = campos[1];
				String foto = campos[2];
				String codEmp = campos[3];
				int codDesfile = Integer.parseInt(campos[4]);
				
				Pabellon pabellon = new Pabellon(nombre, telefono, foto, codEmp, codDesfile);
				lstPabellon.add(pabellon);
				
			}
			entrada.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al cargar los Pabellones");
		}
	}
	
	public void cargarModelo() {
		String archivoEntrada = "Datos/Modelos.txt";
		
		try {
			Scanner entrada = new Scanner(new File(archivoEntrada));
			
			while(entrada.hasNext()) {
				String registro = entrada.nextLine();
				String [] campos = registro.split(";");
				//String pasaporte, String pais, String nombre, String pago, String foto, Fecha fechaNacimiento, int codDesfile
				String pasaporte = campos[0];
				String pais = campos[1];
				String nombre = campos[2];
				String pago = campos[3];
				String foto = campos[4];
				
				int dia = Integer.parseInt(campos[5]);
				int mes = Integer.parseInt(campos[6]);
				int anio = Integer.parseInt(campos[7]);
				
				Fecha fechaNacimiento = new Fecha(dia, mes, anio);
				
				int codDesfile = Integer.parseInt(campos[8]);
				
				Modelo modelo = new Modelo(pasaporte, pais, nombre, pago, foto, fechaNacimiento, codDesfile);
				lstModelo.add(modelo);
			}
			entrada.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al cargar las Modelos");
		}
	}
	
	public void cargarHistorico() {
		String archivoEntrada = "Datos/Historicos.txt";
		
		try {
			Scanner entrada = new Scanner(new File(archivoEntrada));
			while(entrada.hasNext()) {
				String registro = entrada.nextLine();
				String [] campos = registro.split(";");
				//String peso, busto, cintura, estatura, calzado, anio, particularidades, pasaporte
				String peso = campos[0];
				String busto = campos[1];
				String cintura = campos[2];
				String estatura = campos[3];
				String calzado = campos[4];
				String anio = campos[5];
				String particularidades = campos[6];
				String pasaporte = campos[7];
				
				Historico historico = new Historico(peso, busto, cintura, estatura, calzado, anio, particularidades, pasaporte);
				lstHistorico.add(historico);
				
			}
			
			entrada.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al cargar Historico");
		}
	}
	
public void cargarAContrato() {
		
		String archivo_entrada_uno = "Datos/AContrato.txt";
		
		try {
			Scanner scanner = new Scanner(new File(archivo_entrada_uno));
			
			while(scanner.hasNext()) {
				String registro = scanner.nextLine();
				String[] campos = registro.split(";");
				long codigo = Long.parseLong(campos[0]);
				String nombre = campos[1];
				String genero = campos[2];
				String tipo = campos[3];
				String pago = campos[4];
				int codDesfile = Integer.parseInt(campos[5]);
				
				AContrato a_contrato = new AContrato(codigo, nombre, genero, tipo, pago, codDesfile);
				lstAContrato.add(a_contrato);
			}
			scanner.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al cargar los Artistas de Contrato");
		}
	}
	
	public void cargarAAuxiliar() {
		
		String archivo_entrada_dos = "Datos/AAuxiliar.txt";
		
		try {
			Scanner scanner = new Scanner(new File(archivo_entrada_dos));
			
			while(scanner.hasNext()) {
				String registro = scanner.nextLine();
				String[] campos = registro.split(";");
				long codigo = Long.parseLong(campos[0]);
				String nombre = campos[1];
				String genero = campos[2];
				int codDesfile = Integer.parseInt(campos[6]);
				
				int dia = Integer.parseInt(campos[3]);
				int mes = Integer.parseInt(campos[4]);
				int anio = Integer.parseInt(campos[5]);
				
				@SuppressWarnings("deprecation")
				Fecha creacion = new Fecha(dia, mes, anio);
				
				AAuxiliar a_auxiliar = new AAuxiliar(codigo, nombre, genero, creacion, codDesfile);
				lstAAuxiliar.add(a_auxiliar);
			
			}
			scanner.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al cargar los Artistas Auxiliares");
		}
	}
	
	public void cargarPortafolio() {
		String archivoEntrada = "Datos/Portafolios.txt";
		
		try {
			Scanner entrada = new Scanner(new File(archivoEntrada));
			
			while(entrada.hasNext()) {
				String registro = entrada.nextLine();
				String[] campos = registro.split(";");
				
				int codigo = Integer.parseInt(campos[0]);
				String estilo = campos[1];
				String foto = campos[2];
				String anio = campos[3];
				String pasaporte = campos[4];
				
				Portafolio portafolio = new Portafolio(codigo, estilo, foto, anio, pasaporte);
				lstPortafolio.add(portafolio);
				
			}
			entrada.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error al cargar portafolios");
		}
	}
	
	public void cargarApariciones() {
		String archivoEntrada = "Datos/Apariciones.txt";
		
		try {
			Scanner entrada = new Scanner(new File(archivoEntrada));
			while(entrada.hasNext()) {
				//Modelo, Pasaporte, Arriba, Abajo, Desfile
				String registro = entrada.nextLine();
				String [] campos = registro.split(";");
				
				String modelo = campos[0];
				String pasaporte = campos[1];
				String arriba = campos[2];
				String abajo = campos[3];
				String desfile = campos[4];
				
				Aparicion aparicion = new Aparicion(modelo, pasaporte, arriba, abajo, desfile);
				lstApariciones.add(aparicion);
				
				
			}
			entrada.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error al cargar los datos");
		}
	}
	
	
}
/*
String universidad = campos[4];
String carrera = campos[5];

int codevento = Integer.parseInt(campos[6]);
								
Empleado empleado = new Empleado(carne, nombre, numero, pago, universidad, carrera, codevento);
lstEmpleado.add(empleado);
*/