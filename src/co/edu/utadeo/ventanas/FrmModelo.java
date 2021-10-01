package co.edu.utadeo.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.utadeo.modelos.AppEvento;
import co.edu.utadeo.modelos.Modelo;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmModelo extends JFrame {

	private JPanel contentPane;
	private JLabel lblModelo;
	private JLabel lblPasaporte;
	private JLabel lblNacimiento;
	private JLabel lblSalario;
	private JLabel lblNombre;
	private JLabel lblPais;
	public int i =0;
	public static String pasp;

	private static AppEvento event = new AppEvento();
	private ArrayList<Modelo> lstMod = new ArrayList<Modelo>();

	public static FrmDentroDesfile des = new FrmDentroDesfile();

	private int codDes = des.codDesDef;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmModelo frame = new FrmModelo();
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
	public FrmModelo() {

		event.cargarModelo();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Casa de Eventos: "+"\"The Star Rover\"");
		setBounds(100, 100, 1400, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton BtnAgencia = new JButton("AGENCIA");
		BtnAgencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarPasp(i);
				dispose();
				FrmAgencias abrir=new FrmAgencias();
				abrir.setLocationRelativeTo(null);
				abrir.setVisible(true);

			}
		});
		BtnAgencia.setBounds(1118, 54, 225, 52);
		BtnAgencia.setForeground(new Color(0, 0, 102));
		BtnAgencia.setVerticalAlignment(SwingConstants.BOTTOM);
		BtnAgencia.setBackground(new Color(204, 204, 204));
		BtnAgencia.setFont(new Font("Stealdream", Font.PLAIN, 40));
		contentPane.add(BtnAgencia);

		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarPasp(i);
				dispose();
				FrmDentroDesfile a = new FrmDentroDesfile();
				a.setLocationRelativeTo(null);
				a.setVisible(true);
			}
		});
		btnVolver.setFont(new Font("Stealdream", Font.PLAIN, 40));
		btnVolver.setBounds(947, 523, 243, 100);
		contentPane.add(btnVolver);

		lblPasaporte = new JLabel("EspacioPasaporte");
		lblPasaporte.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblPasaporte.setBounds(186, 602, 442, 38);
		contentPane.add(lblPasaporte);


		lblNacimiento = new JLabel("EspacioNacimiento");
		lblNacimiento.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNacimiento.setBounds(186, 553, 442, 38);
		contentPane.add(lblNacimiento);

		lblSalario = new JLabel("EspacioSalario");
		lblSalario.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblSalario.setBounds(186, 505, 442, 38);
		contentPane.add(lblSalario);

		lblNombre = new JLabel("EspacioNombre");
		lblNombre.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNombre.setBounds(186, 463, 442, 38);
		contentPane.add(lblNombre);

		lblPais = new JLabel("EspacioPais");
		lblPais.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblPais.setBounds(186, 414, 442, 38);
		contentPane.add(lblPais);		


		JButton BtnPortafolio = new JButton("Portafolio");
		BtnPortafolio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarPasp(i);
				dispose();
				FrmPortafolio a=new FrmPortafolio();
				a.setLocationRelativeTo(null);
				a.setVisible(true);
			}
		});
		BtnPortafolio.setBounds(1118, 172, 225, 52);
		BtnPortafolio.setForeground(new Color(255, 51, 0));
		BtnPortafolio.setFont(new Font("Stealdream", Font.ITALIC, 40));
		BtnPortafolio.setBackground(new Color(204, 204, 204));
		contentPane.add(BtnPortafolio);

		JLabel Fagencia = new JLabel("icono");
		Fagencia.setBounds(1036, 51, 72, 72);
		Fagencia.setIcon(new ImageIcon("Imagenes/iconoAgencia.png"));
		contentPane.add(Fagencia);

		JLabel Fportafolio = new JLabel("icono");
		Fportafolio.setBounds(1036, 161, 72, 72);
		Fportafolio.setIcon(new ImageIcon("Imagenes/iconoPortafolio.png"));
		contentPane.add(Fportafolio);

		JButton BtnHistorico = new JButton("Hist\u00F3rico");
		BtnHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarPasp(i);
				dispose();
				FrmHistorico a=new FrmHistorico();
				a.setLocationRelativeTo(null);
				a.setVisible(true);
			}
		});
		BtnHistorico.setBounds(1118, 276, 225, 52);
		BtnHistorico.setForeground(new Color(153, 0, 0));
		BtnHistorico.setBackground(new Color(204, 204, 204));
		BtnHistorico.setFont(new Font("Stealdream", Font.ITALIC, 40));
		contentPane.add(BtnHistorico);

		JLabel Fhistoric = new JLabel("icono");
		Fhistoric.setBounds(1036, 276, 72, 72);
		Fhistoric.setIcon(new ImageIcon("Imagenes/iconoHistorial.png"));
		contentPane.add(Fhistoric);

		JButton BtnAparicion = new JButton("Apariciones");
		BtnAparicion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarPasp(i);
				dispose();
				FrmAparicion a = new FrmAparicion();
				a.setLocationRelativeTo(null);
				a.setVisible(true);
			}
		});
		BtnAparicion.setBounds(1118, 385, 227, 54);
		BtnAparicion.setForeground(new Color(51, 0, 102));
		BtnAparicion.setBackground(new Color(204, 204, 204));
		BtnAparicion.setFont(new Font("Stealdream", Font.ITALIC, 40));
		contentPane.add(BtnAparicion);

		JLabel Faparicion = new JLabel("icono");
		Faparicion.setBounds(1036, 380, 72, 72);
		Faparicion.setIcon(new ImageIcon("Imagenes/iconoAparicion.png"));
		contentPane.add(Faparicion);

		JLabel lblPais1 = new JLabel("Pa\u00EDs:");
		lblPais1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPais1.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblPais1.setBounds(10, 414, 166, 38);
		contentPane.add(lblPais1);

		JLabel lblNom = new JLabel("Nombre:");
		lblNom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNom.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNom.setBounds(10, 463, 166, 38);
		contentPane.add(lblNom);

		JLabel lblSal = new JLabel("Salario:");
		lblSal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSal.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblSal.setBounds(10, 505, 166, 38);
		contentPane.add(lblSal);

		JLabel lblNewLabel_2 = new JLabel("Nacimiento:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(10, 553, 166, 38);
		contentPane.add(lblNewLabel_2);

		lblModelo = new JLabel("ImagenModelo");
		lblModelo.setIcon(new ImageIcon("Imagenes/Kenda.jpg"));
		lblModelo.setBounds(232, 74, 245, 300);
		contentPane.add(lblModelo);

		JLabel lblFondo1 = new JLabel("Fondo");
		lblFondo1.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblFondo1.setBounds(735, 0, 649, 661);
		contentPane.add(lblFondo1);

		JLabel Fderecha = new JLabel("derecha");
		Fderecha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i++;
				if(i>lstMod.size()-1)i=0;
				mostrarModelo(i);
			}
		});
		Fderecha.setIcon(new ImageIcon("Imagenes/boton1.jpg"));
		Fderecha.setBounds(536, 123, 170, 170);
		contentPane.add(Fderecha);

		JLabel lizquierda = new JLabel("izquierda");
		lizquierda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i--;
				if(i<0)i=lstMod.size()-1;
				mostrarModelo(i);
			}
		});
		lizquierda.setIcon(new ImageIcon("Imagenes/boton.jpg"));
		lizquierda.setBounds(42, 138, 134, 140);
		contentPane.add(lizquierda);

		JLabel lblbl = new JLabel("Pasaporte:");
		lblbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lblbl.setFont(new Font("Stealdream", Font.PLAIN, 40));
		lblbl.setBounds(10, 602, 166, 38);
		contentPane.add(lblbl);

		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setIcon(new ImageIcon("Imagenes/fondo.jpg"));
		lblFondo.setBounds(0, 408, 745, 253);
		contentPane.add(lblFondo);

		crearLista(codDes);
		mostrarModelo(0);
	}

	public void mostrarModelo(int i) {
		Modelo m = lstMod.get(i);
		lblModelo.setIcon(new ImageIcon(m.getFoto()));
		lblPais.setText(m.getPais());
		lblNombre.setText(m.getNombre());
		lblSalario.setText(m.getPago()+"€");
		lblNacimiento.setText(m.getFechaNacimiento().toString());
		lblPasaporte.setText(m.getPasaporte());

	}

	public void crearLista(int a) {
		for(Modelo m:event.lstModelo) {
			if(m.getCodDesfile()==a) {
				lstMod.add(m);
			}
		}
	}
	
	public void guardarPasp(int i) {
		Modelo m = lstMod.get(i);
		pasp = m.getPasaporte();
	}
	
	public String getPasp() {
		return this.pasp;
	}
}