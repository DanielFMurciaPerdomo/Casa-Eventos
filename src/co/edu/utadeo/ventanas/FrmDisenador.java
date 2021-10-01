package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.utadeo.modelos.AppEvento;
import co.edu.utadeo.modelos.Disenador;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmDisenador extends JFrame {

	private JPanel contentPane;
	private static AppEvento event = new AppEvento();
	
	private JLabel lblNombre;
	private JLabel lblOrigen;
	private JLabel lblPasaporte;
	private JLabel lblFotoDisenador;
	
	public static FrmDentroDesfile des = new FrmDentroDesfile();
	
	private int codDes = des.codDesDef;
	
	
	
	private final JLabel lblFondoColor = new JLabel("Fondo");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					FrmDisenador frame = new FrmDisenador();
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
	public FrmDisenador() {
		
		event.cargarDisenadores();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 700);
		setTitle("Casa de Eventos: "+"\"The Star Rover\"");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblFotoDisenador = new JLabel("Foto");
		lblFotoDisenador.setIcon(new ImageIcon("Imagenes/disenador.jpg"));
		lblFotoDisenador.setBounds(47, 108, 450, 450);
		contentPane.add(lblFotoDisenador);
		
		JLabel lblTitulo = new JLabel("Dise\u00F1ador");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Stealdream", Font.PLAIN, 70));
		lblTitulo.setBounds(78, 29, 393, 69);
		contentPane.add(lblTitulo);
		
		JLabel lblNombreTitulo = new JLabel("Nombre:");
		lblNombreTitulo.setFont(new Font("Stealdream", Font.PLAIN, 45));
		lblNombreTitulo.setBounds(746, 157, 140, 43);
		contentPane.add(lblNombreTitulo);
		
		JLabel lblPaisOrigenTitulo = new JLabel("Pais de Origen:");
		lblPaisOrigenTitulo.setFont(new Font("Stealdream", Font.PLAIN, 45));
		lblPaisOrigenTitulo.setBounds(644, 301, 242, 43);
		contentPane.add(lblPaisOrigenTitulo);
		
		JLabel lblPasaporteTitulo = new JLabel("Pasaporte:");
		lblPasaporteTitulo.setFont(new Font("Stealdream", Font.PLAIN, 45));
		lblPasaporteTitulo.setBounds(716, 455, 170, 35);
		contentPane.add(lblPasaporteTitulo);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Stealdream", Font.PLAIN, 35));
		lblNombre.setBounds(896, 159, 460, 44);
		contentPane.add(lblNombre);
		
		lblOrigen = new JLabel("Origen");
		lblOrigen.setFont(new Font("Stealdream", Font.PLAIN, 35));
		lblOrigen.setBounds(896, 304, 460, 43);
		contentPane.add(lblOrigen);
		
		lblPasaporte = new JLabel("Pasaporte");
		lblPasaporte.setFont(new Font("Stealdream", Font.PLAIN, 35));
		lblPasaporte.setBounds(896, 458, 460, 35);
		contentPane.add(lblPasaporte);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				FrmDentroDesfile p = new FrmDentroDesfile();
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Stealdream", Font.PLAIN, 30));
		btnNewButton.setBounds(1100, 557, 187, 77);
		contentPane.add(btnNewButton);
		lblFondoColor.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblFondoColor.setBounds(0, 0, 606, 663);
		contentPane.add(lblFondoColor);
		
		setBackground(SystemColor.activeCaption);
		
		mostrarDisenador(codDes);
		
	}
	public void mostrarDisenador(int i) {
		for(Disenador dis: event.lstDisenador) {
			if(dis.getCodDesfile()==i) {
				lblNombre.setText(dis.getNombre());
				lblOrigen.setText(dis.getOrigen());
				lblPasaporte.setText(dis.getPasaporte());
				lblFotoDisenador.setIcon(new ImageIcon(dis.getFoto()));
			}
		}	
	}

}


