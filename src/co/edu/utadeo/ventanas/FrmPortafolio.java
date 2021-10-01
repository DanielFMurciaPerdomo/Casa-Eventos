package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.utadeo.modelos.AppEvento;
import co.edu.utadeo.modelos.Historico;
import co.edu.utadeo.modelos.Portafolio;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmPortafolio extends JFrame {

	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblPasaporte;
	private JLabel lblCreacion;
	private JLabel lblObjetivo;
	private JLabel lblKeboda;
	private int i=0;
	
	private static AppEvento event = new AppEvento();

	private ArrayList<Portafolio> lstPort = new ArrayList<Portafolio>();

	public static FrmModelo mode = new FrmModelo();
	public static String pasp = mode.pasp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPortafolio frame = new FrmPortafolio();
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
	public FrmPortafolio() {
		event.cargarPortafolio();
		crearLstPort(mode.getPasp());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Casa de Eventos: "+"\"The Star Rover\"");
		setBounds(100, 100, 1400, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIzquierda = new JLabel("");
		lblIzquierda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i--;
				if(i<0)i=lstPort.size()-1;
				mostrarPortafolio(i);
			}
		});
		lblIzquierda.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIzquierda.setIcon(new ImageIcon("Imagenes/boton.jpg"));
		lblIzquierda.setBounds(51, 378, 170, 170);
		contentPane.add(lblIzquierda);
		
		JLabel lblDerecha = new JLabel("Derecha");
		lblDerecha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i++;
				if(i>lstPort.size()-1)i=0;
				mostrarPortafolio(i);
			}
		});
		lblDerecha.setIcon(new ImageIcon("Imagenes/boton1.jpg"));
		lblDerecha.setBounds(1179, 378, 170, 170);
		contentPane.add(lblDerecha);
		
		lblObjetivo = new JLabel("Objetivo: <dynamic>");
		lblObjetivo.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjetivo.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblObjetivo.setBounds(171, 86, 1126, 64);
		contentPane.add(lblObjetivo);
		
		lblKeboda = new JLabel("imagen");
		lblKeboda.setIcon(new ImageIcon("Imagenes/portafokele.jpg"));
		lblKeboda.setBounds(453, 206, 400, 444);
		contentPane.add(lblKeboda);
		
		lblCreacion = new JLabel("A\u00F1o Creacion: <dynamic>");
		lblCreacion.setFont(new Font("Stealdream", Font.PLAIN, 45));
		lblCreacion.setBounds(214, 147, 533, 54);
		contentPane.add(lblCreacion);
		
		lblPasaporte = new JLabel("Pasaporte: <dynamic>");
		lblPasaporte.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblPasaporte.setBounds(832, 148, 447, 54);
		contentPane.add(lblPasaporte);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrmModelo a=new FrmModelo();
				a.setLocationRelativeTo(null);
				a.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Stealdream", Font.PLAIN, 40));
		btnNewButton.setBounds(10, 562, 168, 64);
		contentPane.add(btnNewButton);
		
		lblNombre = new JLabel("Portafolio");
		lblNombre.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(416, 11, 670, 64);
		contentPane.add(lblNombre);
		
		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblFondo.setBounds(0, 0, 1384, 317);
		contentPane.add(lblFondo);
		
		JLabel lblNewLabel = new JLabel("Fondo");
		lblNewLabel.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblNewLabel.setBounds(231, 269, 913, 392);
		contentPane.add(lblNewLabel);
		
		mostrarPortafolio(0);
	}
	
	public void mostrarPortafolio(int i) {
		Portafolio p = lstPort.get(i);
		if(p.getPasaporte().equals(mode.getPasp())) {
			lblObjetivo.setText("Objetivo: "+p.getEstilo());
			lblCreacion.setText("Año de Creación: "+p.getAnio());
			lblPasaporte.setText("Pasaporte: "+p.getPasaporte());
			lblKeboda.setIcon(new ImageIcon(p.getFoto()));
			
		}
	}
	  
	public void crearLstPort(String a) {
		for(Portafolio h:event.lstPortafolio) {
			if(h.getPasaporte().equals(a)) {
				lstPort.add(h);
			}
			
		}
	}
}