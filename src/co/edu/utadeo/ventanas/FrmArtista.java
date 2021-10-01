package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import co.edu.utadeo.modelos.AAuxiliar;
import co.edu.utadeo.modelos.AContrato;
import co.edu.utadeo.modelos.AppEvento;
import co.edu.utadeo.modelos.Evento;
import co.edu.utadeo.modelos.Historico;
import co.edu.utadeo.modelos.Modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmArtista extends JFrame {

	private JPanel contentPane;
	public int i = 0;
	public int j = 0;
	private JLabel lblNombre;
	private JLabel lblNombre_1;
	private JLabel lblGenero;
	private JLabel lblGenero_1;
	private JLabel lblTipo;
	private JLabel lblPago;
	private JLabel lblCreacion;

	private static AppEvento event = new AppEvento();
	private JLabel lblFondo;
	
	private ArrayList<AContrato> lstArtC = new ArrayList<AContrato>();
	private ArrayList<AAuxiliar> lstArtA = new ArrayList<AAuxiliar>();

	public static FrmDentroDesfile des = new FrmDentroDesfile();

	private int codDes = des.codDesDef;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					FrmArtista frame = new FrmArtista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmArtista() {
		
		event.cargarAContrato();
		event.cargarAAuxiliar();
		crearLstArtC(codDes);
		crearLstArtA(codDes);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTituloArtista = new JLabel("Artistas");
		lblTituloArtista.setFont(new Font("Stealdream", Font.PLAIN, 45));
		lblTituloArtista.setBounds(644, 33, 136, 45);
		contentPane.add(lblTituloArtista);

		JLabel lblNewLabel = new JLabel("Artistas de Contrato");
		lblNewLabel.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNewLabel.setBounds(167, 94, 283, 49);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Artistas Auxiliares");
		lblNewLabel_1.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(907, 90, 283, 62);
		contentPane.add(lblNewLabel_1);

		// Boton Izquierdo AC
		JLabel lblIzquierdaAc = new JLabel("Flecha Izquierda AC");
		lblIzquierdaAc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i--;
				if (i < 0) i = lstArtC.size() - 1;
				mostrarAContrato(i);
			}
		});
		lblIzquierdaAc.setIcon(new ImageIcon("Imagenes/boton.jpg"));
		lblIzquierdaAc.setBounds(116, 466, 170, 170);
		contentPane.add(lblIzquierdaAc);

		// Boton Derecho AC
		JLabel lblFlechaDerechaAc = new JLabel("Flecha Derecha AC");
		lblFlechaDerechaAc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i++;
				if (i > lstArtC.size() - 1) i = 0;
				mostrarAContrato(i);
			}
		});
		lblFlechaDerechaAc.setIcon(new ImageIcon("Imagenes/boton1.jpg"));
		lblFlechaDerechaAc.setBounds(308, 466, 170, 170);
		contentPane.add(lblFlechaDerechaAc);

		// Boton Izquierdo AA
		JLabel lblFlechaIzquierdaAa = new JLabel("Flecha Izquierda AA");
		lblFlechaIzquierdaAa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				j--;
				if (j < 0) j = lstArtA.size() -1;
				mostrarAAuxiliar(j);
			}
		});
		
		
		lblFlechaIzquierdaAa.setIcon(new ImageIcon("Imagenes/boton.jpg"));
		lblFlechaIzquierdaAa.setBounds(841, 466, 170, 170);
		contentPane.add(lblFlechaIzquierdaAa);

		// Boton Derecho AA
		JLabel lblFlechaDerechaAa = new JLabel("Flecha Derecha AA");
		lblFlechaDerechaAa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				j++;
				if (j > lstArtA.size() - 1)	j = 0;
				mostrarAAuxiliar(j);
			}
		});
		lblFlechaDerechaAa.setIcon(new ImageIcon("Imagenes/boton1.jpg"));
		lblFlechaDerechaAa.setBounds(1033, 466, 170, 170);
		contentPane.add(lblFlechaDerechaAa);

		lblNombre = new JLabel("Nombre: <dynamic>");
		lblNombre.setFont(new Font("Stealdream", Font.PLAIN, 27));
		lblNombre.setBounds(147, 217, 321, 45);
		contentPane.add(lblNombre);

		lblGenero = new JLabel("Genero: <dynamic>");
		lblGenero.setFont(new Font("Stealdream", Font.PLAIN, 27));
		lblGenero.setBounds(147, 273, 321, 45);
		contentPane.add(lblGenero);

		lblTipo = new JLabel("Tipo: <dynamic>");
		lblTipo.setFont(new Font("Stealdream", Font.PLAIN, 27));
		lblTipo.setBounds(147, 329, 321, 45);
		contentPane.add(lblTipo);

		lblPago = new JLabel("Pago: <dynamic>");
		lblPago.setFont(new Font("Stealdream", Font.PLAIN, 27));
		lblPago.setBounds(147, 385, 321, 45);
		contentPane.add(lblPago);

		lblGenero_1 = new JLabel("Genero: <dynamic>");
		lblGenero_1.setFont(new Font("Stealdream", Font.PLAIN, 27));
		lblGenero_1.setBounds(889, 273, 321, 45);
		contentPane.add(lblGenero_1);

		lblNombre_1 = new JLabel("Nombre: <dynamic>");
		lblNombre_1.setFont(new Font("Stealdream", Font.PLAIN, 27));
		lblNombre_1.setBounds(889, 217, 321, 45);
		contentPane.add(lblNombre_1);

		lblCreacion = new JLabel("Fecha de Creacion: <dynamic>");
		lblCreacion.setFont(new Font("Stealdream", Font.PLAIN, 27));
		lblCreacion.setBounds(889, 329, 321, 45);
		contentPane.add(lblCreacion);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrmDentroDesfile n = new FrmDentroDesfile();
				n.setLocationRelativeTo(null);
				n.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Stealdream", Font.PLAIN, 40));
		btnNewButton.setBounds(552, 558, 154, 45);
		contentPane.add(btnNewButton);
		
		lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblFondo.setBounds(0, 0, 1384, 441);
		contentPane.add(lblFondo);

		mostrarAContrato(0);
		mostrarAAuxiliar(0);

	}

	public void mostrarAContrato(int i) {
		AContrato a_contrato = lstArtC.get(i);
		String nombre = "Nombre: " + a_contrato.getNombre();
		lblNombre.setText(nombre);
		String genero = "Genero: " + a_contrato.getGenero();
		lblGenero.setText(genero);
		String tipo = "Tipo: " + a_contrato.getTipo();
		lblTipo.setText(tipo);
		String pago = "Pago: " + a_contrato.getPago();
		lblPago.setText(pago);

	}
	
	public void crearLstArtC(int a) {
		for(AContrato h:event.lstAContrato) {
			if(h.getCodDesfile()==a) {
				lstArtC.add(h);
			}
		}
	}

	public void mostrarAAuxiliar(int j) {
		AAuxiliar a_auxiliar = lstArtA.get(j);
		String nombre = "Nombre: " + a_auxiliar.getNombre();
		lblNombre_1.setText(nombre);
		String genero = "Genero: " + a_auxiliar.getGenero();
		lblGenero_1.setText(genero);
		lblCreacion.setText("Fecha de Creación: " + a_auxiliar.getCreacion().toString());

	}
	
	public void crearLstArtA(int a) {
		for(AAuxiliar h:event.lstAAuxiliar) {
			if(h.getCogDesfile()==a) {
				lstArtA.add(h);
			}
		}
	}
}