package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import co.edu.utadeo.modelos.AppEvento;
import co.edu.utadeo.modelos.Desfile;
import co.edu.utadeo.modelos.Empleado;
import co.edu.utadeo.modelos.Evento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FrmEventos extends JFrame {

	private JPanel contentPane;
	private static AppEvento event = new AppEvento();
	public int i =0;
	private JLabel lblTituloEvento;
	private JLabel lblEvento;
	private JLabel lblInicio;
	private JLabel lblFin;
	public static ArrayList<Desfile> lstDesfilesDefinidos = new ArrayList<Desfile>();
	public static ArrayList<Empleado> lstEmpDefinidos = new ArrayList<Empleado>();
	public static ArrayList<Empleado> lstEmpRasoDef = new ArrayList<Empleado>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					event.cargarEvento();
					event.cargarDesfile();
					FrmEventos frame = new FrmEventos();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace(); 
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmEventos() {
				
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Casa de Eventos: "+"\"The Star Rover\"");
		setBounds(100, 100, 1400, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("Imagenes/Logo.PNG"));
		lblLogo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLogo.setBounds(170, 412, 178, 219);
		contentPane.add(lblLogo);
		
		JLabel lblImagenUno = new JLabel("");
		lblImagenUno.setIcon(new ImageIcon("Imagenes/imagen_dos.jpg"));
		lblImagenUno.setBounds(32, 214, 245, 166);
		contentPane.add(lblImagenUno);
		
		JLabel lblNewLabel = new JLabel("\"The Star Rover\"");
		lblNewLabel.setFont(new Font("Stealdream", Font.BOLD, 45));
		lblNewLabel.setBounds(70, 100, 316, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblLogoDos = new JLabel("Casa de Eventos ");
		lblLogoDos.setFont(new Font("Stealdream", Font.BOLD, 45));
		lblLogoDos.setBounds(32, 39, 316, 45);
		contentPane.add(lblLogoDos);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblFondo.setBounds(0, 0, 436, 700);
		contentPane.add(lblFondo);
		
		lblEvento = new JLabel("Imagen Evento");
		lblEvento.setIcon(new ImageIcon("Imagenes/Evento1.jpg"));
		lblEvento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				event.cargarDesfile();
				guardarDesfilesDelEvento(i);
				dispose();
				FrmDesfile p = new FrmDesfile();
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
		lblEvento.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblEvento.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvento.setBounds(625, 107, 568, 360);
		contentPane.add(lblEvento);
		
		JLabel lblIzquierda = new JLabel("Flecha Izquierda");
		lblIzquierda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i--;
				if(i<0) i=event.lstEvento.size()-1;
				mostrarEvento(i);
			}
		});
		lblIzquierda.setIcon(new ImageIcon("Imagenes/boton.jpg"));
		lblIzquierda.setBounds(446, 210, 170, 170);
		contentPane.add(lblIzquierda);
		
		JLabel lblFlechaDerecha = new JLabel("Flecha Derecha");
		lblFlechaDerecha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i++;
				if(i>event.lstEvento.size()-1) i=0;
				mostrarEvento(i);
			}
		});
		lblFlechaDerecha.setIcon(new ImageIcon("Imagenes/boton1.jpg"));
		lblFlechaDerecha.setBounds(1192, 210, 170, 170);
		contentPane.add(lblFlechaDerecha);
		
		lblTituloEvento = new JLabel("Titulo: ");
		lblTituloEvento.setFont(new Font("Stealdream", Font.PLAIN, 27));
		lblTituloEvento.setBounds(531, 523, 321, 45);
		contentPane.add(lblTituloEvento);
		
		JLabel lblEmpleados = new JLabel("Empleados");
		lblEmpleados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				event.cargarEmpleados();
				guardarEmpleadosDelEvento(i);
				guardarEmpleadosDelEventoRaso(i);
				dispose();
				FrmEmpleado p = new FrmEmpleado();
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
		lblEmpleados.setIcon(new ImageIcon("Imagenes/Empleado.png"));
		lblEmpleados.setBounds(926, 476, 130, 130);
		contentPane.add(lblEmpleados);
		
		JLabel lblNewLabel_1 = new JLabel("Empleados");
		lblNewLabel_1.setFont(new Font("Stealdream", Font.PLAIN, 27));
		lblNewLabel_1.setBounds(936, 617, 111, 21);
		contentPane.add(lblNewLabel_1);
		
		lblInicio = new JLabel("Fecha inicio");
		lblInicio.setFont(new Font("Stealdream", Font.PLAIN, 30));
		lblInicio.setBounds(531, 579, 321, 27);
		contentPane.add(lblInicio);
		
		lblFin = new JLabel("Fecha Fin");
		lblFin.setFont(new Font("Stealdream", Font.PLAIN, 30));
		lblFin.setBounds(531, 606, 321, 25);
		contentPane.add(lblFin);
	
		mostrarEvento(0);
		
	}
	public void mostrarEvento(int i) {
		Evento evento = event.lstEvento.get(i);
		String titulo = "Titulo: "+evento.getNombre();
		lblTituloEvento.setText(titulo);
		lblInicio.setText("Fecha Inicio: "+evento.getInicio().toString());
		lblFin.setText("Fecha Fin: "+ evento.getFin().toString());
		lblEvento.setIcon(new ImageIcon(evento.getFoto()));
		
	}
	
	public void guardarDesfilesDelEvento(int i) {
		Evento ev = event.lstEvento.get(i);
		for(Desfile e:event.lstDesfile) {
			if(ev.getCodigo()==e.getCodevento()) {
				lstDesfilesDefinidos.add(e);
			}
		}
	}
	
	public void guardarEmpleadosDelEvento(int i) {
		Evento ev = event.lstEvento.get(i);
		for(Empleado e: event.lstEmpleado) {
			if(ev.getCodigo()==e.getCodevento()) {
				lstEmpDefinidos.add(e);
			} 
		}
	}
	
	public void guardarEmpleadosDelEventoRaso(int i) {
		Evento ev = event.lstEvento.get(i);
		for(Empleado e: event.lstEmpleado) {
			if(ev.getCodigo()==e.getCodevento() && e.getUniversidad().equals("0")) {
				lstEmpDefinidos.add(e);
			}
		}
	}
	
}
