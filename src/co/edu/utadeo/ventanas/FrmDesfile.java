package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.utadeo.modelos.AppEvento;
import co.edu.utadeo.modelos.Desfile;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmDesfile extends JFrame {

	private JPanel contentPane;
	public static FrmEventos ev = new FrmEventos();
	private JLabel lblHora;
	private JLabel lblFecha;
	private JLabel lblTituloDesfile;
	private JLabel lblDesfile;
	private int i =0;
	public static ArrayList<Desfile> lstDesDef= ev.lstDesfilesDefinidos;
	public static int codigoDesfile;
	
	
	/**
	 * Create the frame.
	 */
	public FrmDesfile() {
				
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Casa de Eventos: "+"\"The Star Rover\"");
		setBounds(100, 100, 1400, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIzquierda = new JLabel("Flecha Izquiera");
		lblIzquierda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i--;
				if(i<0) i=lstDesDef.size()-1;
				mostrarDesfile(i);
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Stealdream", Font.PLAIN, 26));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ev.lstDesfilesDefinidos.clear();
				dispose();
				FrmEventos ev = new FrmEventos();
				ev.setLocationRelativeTo(null);
				ev.setVisible(true);
			}
		});
		btnVolver.setBounds(21, 579, 127, 52);
		contentPane.add(btnVolver);
		lblIzquierda.setIcon(new ImageIcon("Imagenes/boton.jpg"));
		lblIzquierda.setBounds(79, 231, 170, 170);
		contentPane.add(lblIzquierda);
		
		JLabel lblDerecha = new JLabel("Flecha Derecha");
		lblDerecha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i++;
				if(i>lstDesDef.size()-1) i=0;
				mostrarDesfile(i);
			}
		});
		lblDerecha.setIcon(new ImageIcon("Imagenes/boton1.jpg"));
		lblDerecha.setBounds(1119, 231, 170, 170);
		contentPane.add(lblDerecha);
		
		lblDesfile = new JLabel("Imagen Desfile");
		lblDesfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				guardarCodigoDesfile(i);
				dispose();
				FrmDentroDesfile p = new FrmDentroDesfile();
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
		lblDesfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesfile.setIcon(new ImageIcon("Imagenes/Desfile1-1.jpg"));
		lblDesfile.setFont(new Font("Tahoma", Font.PLAIN, 63));
		lblDesfile.setBounds(259, 115, 850, 485);
		contentPane.add(lblDesfile);
		
		lblTituloDesfile = new JLabel("Titulo del Desfile");
		lblTituloDesfile.setFont(new Font("Stealdream", Font.PLAIN, 45));
		lblTituloDesfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloDesfile.setBounds(431, 23, 437, 81);
		contentPane.add(lblTituloDesfile);
		
		lblFecha = new JLabel("Fecha: ");
		lblFecha.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblFecha.setBounds(292, 612, 380, 38);
		contentPane.add(lblFecha);
		
		lblHora = new JLabel("Hora: ");
		lblHora.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblHora.setBounds(682, 612, 348, 38);
		contentPane.add(lblHora);
		
		JLabel lblFondo1 = new JLabel("");
		lblFondo1.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblFondo1.setBounds(1299, 0, 86, 661);
		contentPane.add(lblFondo1);
		
		JLabel lblFondo2 = new JLabel("");
		lblFondo2.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblFondo2.setBounds(0, 0, 69, 661);
		contentPane.add(lblFondo2);
		
		mostrarDesfile(0);
	}
	
	public void mostrarDesfile(int i){
		Desfile desfile = lstDesDef.get(i);
		lblTituloDesfile.setText("Formato: "+desfile.getNombre());
		lblFecha.setText("Fecha: "+desfile.getFecha().toString());
		lblHora.setText("Hora: "+desfile.getHora().toString());
		lblDesfile.setIcon(new ImageIcon(desfile.getFoto()));
		
		
	}
	
	public void guardarCodigoDesfile(int i) {
		Desfile de = lstDesDef.get(i);
		codigoDesfile = de.getNumero();
	}
}
